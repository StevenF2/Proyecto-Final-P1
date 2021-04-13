package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.Empresa;

import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MostrarContrato extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCancelar;
	private JTable tblMostrarProyectos;
	private static DefaultTableModel model;
	private static Object[] rows;


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			MostrarContrato dialog = new MostrarContrato();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public MostrarContrato() {
		setTitle("Mostrar Contratos");
		setBounds(100, 100, 723, 422);
		setLocationRelativeTo(null);
		String columns[] = {"Num. Contrato", "Cedula Cliente", "Nombre Cliente", "Fecha Inicio", "Fecha Entrega", "Monto Total"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Contratos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					tblMostrarProyectos = new JTable();
					tblMostrarProyectos.setModel(model);
					tblMostrarProyectos.setBackground(new Color(255, 255, 255));
					tblMostrarProyectos.getTableHeader().setReorderingAllowed(false);
					scrollPane.setViewportView(tblMostrarProyectos);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(51, 102, 153));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnCancelar = new JButton("");
				btnCancelar.setIcon(new ImageIcon(MostrarContrato.class.getResource("/icons/home (2).png")));
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnCancelar.setBorderPainted(false);
				btnCancelar.setForeground(new Color(255, 255, 255));
				btnCancelar.setBackground(new Color(51, 102, 153));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		cargarContratos();
	}
	private static void cargarContratos() {
		model.setRowCount(0);
		rows = new Object[model.getColumnCount()];
		DateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
		String inicio ,finalFecha = "";
		for(int i = 0; i < Empresa.getInstance().getContratos().size(); i++) {
			rows[0] = Empresa.getInstance().getContratos().get(i).getNumeroContrato();
			rows[1] = Empresa.getInstance().getContratos().get(i).getCedulaCliente();
			rows[2] = Empresa.getInstance().getContratos().get(i).getCliente().getNombre();
			inicio = dtf.format(Empresa.getInstance().getContratos().get(i).getProyecto().getFechaInicio());
			finalFecha = dtf.format(Empresa.getInstance().getContratos().get(i).getProyecto().getFechaEntrega());
			rows[3] = inicio;
			rows[4] = finalFecha;
			rows[5] = Empresa.getInstance().getContratos().get(i).getMontoTotal();
			model.addRow(rows);
		}
		
	}

}
