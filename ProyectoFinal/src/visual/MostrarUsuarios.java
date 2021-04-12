package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.Disenador;
import logico.Empresa;
import logico.Jefe;
import logico.Planificador;
import logico.Programador;

import javax.swing.border.EtchedBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MostrarUsuarios extends JDialog {
	private JTable tblMostrarUsuarios;
	private static DefaultTableModel model;
	private static Object[] rows;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			MostrarUsuarios dialog = new MostrarUsuarios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public MostrarUsuarios() {
		setBounds(100, 100, 494, 361);
		setLocationRelativeTo(null);
		String columns[] = {"Nombre Usuario", "Tipo Usuario"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(51, 102, 153));
			buttonPane.setBounds(0, 279, 478, 43);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton btnNewButton = new JButton("");
				btnNewButton.setIcon(new ImageIcon(MostrarUsuarios.class.getResource("/icons/home (2).png")));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(51, 102, 153));
				btnNewButton.setBounds(379, 0, 89, 43);
				buttonPane.add(btnNewButton);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(null);
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 478, 283);
			getContentPane().add(panel);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Mostrar Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setLayout(null);
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(10, 11, 458, 256);
				panel.add(panel_1);
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(new Color(255, 255, 255));
					panel_2.setBounds(10, 23, 438, 222);
					panel_1.add(panel_2);
					panel_2.setLayout(new BorderLayout(0, 0));
					{
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						panel_2.add(scrollPane, BorderLayout.CENTER);
						
						tblMostrarUsuarios = new JTable();
						tblMostrarUsuarios.setModel(model);
						tblMostrarUsuarios.setBackground(new Color(255, 255, 255));
						tblMostrarUsuarios.getTableHeader().setReorderingAllowed(false);
						scrollPane.setViewportView(tblMostrarUsuarios);
					}
				}
			}
		}
		cargarUsuarios();
	}
	private static void cargarUsuarios() {
		model.setRowCount(0);
		rows = new Object[model.getColumnCount()];
		for(int i = 0; i < Empresa.getInstance().getUsuarios().size(); i++) {
			rows[0] = Empresa.getInstance().getUsuarios().get(i).getNombreUsuario();
			rows[1] = Empresa.getInstance().getUsuarios().get(i).getTipo();
			model.addRow(rows);
		}
		
	}
	
}
