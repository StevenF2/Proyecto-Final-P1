package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import logico.Empresa;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class MostrarEmpleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tblEmpleado;
	private static DefaultTableModel model;
	private static Object[] rows;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			MostrarEmpleado dialog = new MostrarEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public MostrarEmpleado() {
		setBounds(100, 100, 590, 435);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					tblEmpleado = new JTable();
					tblEmpleado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					model = new DefaultTableModel();
					String[] encabezados = {"Cedula", "Nombre", "Apellido", "Pago por Hora", "Clasificacion"};
					model.setColumnIdentifiers(encabezados);
					tblEmpleado.setModel(model);
					tblEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					tblEmpleado.getTableHeader().setReorderingAllowed(false);
					TableColumnModel columM = tblEmpleado.getColumnModel();
					columM.getColumn(1).setPreferredWidth(150);
					columM.getColumn(2).setPreferredWidth(150);
					columM.getColumn(4).setPreferredWidth(150);

					scrollPane.setViewportView(tblEmpleado);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(51, 102, 153));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setBorderPainted(false);
				btnCancelar.setBackground(new Color(51, 102, 153));
				btnCancelar.setForeground(new Color(255, 255, 255));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		cargarEmpleados();
	}
	//remember to change it to public and static
	public static void cargarEmpleados() {
		rows = new Object[model.getColumnCount()];
		model.setRowCount(0);
		for(int i = 0; i < Empresa.getInstance().getEmpleados().size(); i++) {
			rows[0] = Empresa.getInstance().getEmpleados().get(i).getCedula();
			rows[1] = Empresa.getInstance().getEmpleados().get(i).getNombre();
			rows[2] = Empresa.getInstance().getEmpleados().get(i).getApellido();
			rows[3] = Empresa.getInstance().getEmpleados().get(i).getSalario();
			rows[4] = Empresa.getInstance().getEmpleados().get(i).getClass().getSimpleName();
			model.addRow(rows);
		}
	}
}
