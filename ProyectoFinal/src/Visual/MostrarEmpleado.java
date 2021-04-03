package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import logico.Disenador;
import logico.Empresa;
import logico.Jefe;
import logico.Planificador;
import logico.Programador;
import logico.Secretario;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarEmpleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tblEmpleado;
	private static DefaultTableModel model;
	private static Object[] rows;
	private JButton btnCancelar;
	private JComboBox cmbEmpleados;

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
		setBounds(100, 100, 590, 467);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(5, 49, 564, 341);
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 0, 564, 385);
				panel.add(scrollPane);
				{
					tblEmpleado = new JTable();
					tblEmpleado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					model = new DefaultTableModel();
					String[] encabezados = {"Cedula", "Nombre", "Apellido", "Pago por Hora", "Clasificacion"};
					model.setColumnIdentifiers(encabezados);
					tblEmpleado.setModel(model);
					tblEmpleado.getTableHeader().setReorderingAllowed(false);
					scrollPane.setViewportView(tblEmpleado);
				}
			}
		}
		
		cmbEmpleados = new JComboBox();
		cmbEmpleados.setModel(new DefaultComboBoxModel(new String[] {"Todo", "Jefe", "Disenador", "Programador", "Planificador", "Secretario"}));
		cmbEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cargarEmpleados(cmbEmpleados.getSelectedItem().toString());
			}
		});
		cmbEmpleados.setBounds(88, 21, 132, 20);
		contentPanel.add(cmbEmpleados);
		
		JLabel lblNewLabel = new JLabel("Filtrar por");
		lblNewLabel.setBounds(10, 24, 100, 14);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(51, 102, 153));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnCancelar.setBorderPainted(false);
				btnCancelar.setBackground(new Color(51, 102, 153));
				btnCancelar.setForeground(new Color(255, 255, 255));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		cargarEmpleados(cmbEmpleados.getSelectedItem().toString());
	}
	//remember to change it to public and static
	public static void cargarEmpleados(String selectedItem) {
		//rows = new Object[model.getColumnCount()];
		model.setRowCount(0);
		for(int i = 0; i < Empresa.getInstance().getEmpleados().size(); i++) {
			if(selectedItem.equalsIgnoreCase("Jefe")) {
				if(Empresa.getInstance().getEmpleados().get(i) instanceof Jefe) {
					model.addRow(insertInRow(i));
				}
			} else if (selectedItem.equalsIgnoreCase("Programador")) {
				if(Empresa.getInstance().getEmpleados().get(i) instanceof Programador) {
					model.addRow(insertInRow(i));
				}
			}else if (selectedItem.equalsIgnoreCase("Disenador")) {
				if(Empresa.getInstance().getEmpleados().get(i) instanceof Disenador) {
					model.addRow(insertInRow(i));
				}
			} else if (selectedItem.equalsIgnoreCase("Planificador")) {
				if(Empresa.getInstance().getEmpleados().get(i) instanceof Planificador) {
					model.addRow(insertInRow(i));
				}
			}else if (selectedItem.equalsIgnoreCase("Secretario")) {
				if(Empresa.getInstance().getEmpleados().get(i) instanceof Secretario) {
					model.addRow(insertInRow(i));
				}
			}else if (selectedItem.equalsIgnoreCase("Todo")) {
				model.addRow(insertInRow(i));
			}
			/*rows[0] = Empresa.getInstance().getEmpleados().get(i).getCedula();
			rows[1] = Empresa.getInstance().getEmpleados().get(i).getNombre();
			rows[2] = Empresa.getInstance().getEmpleados().get(i).getApellido();
			rows[3] = Empresa.getInstance().getEmpleados().get(i).getSalario();
			rows[4] = Empresa.getInstance().getEmpleados().get(i).getClass().getSimpleName();*/
			//model.addRow(rows);
		}
	}
	
	private static Object[] insertInRow(int index) {
		rows = new Object[model.getColumnCount()];
		rows[0] = Empresa.getInstance().getEmpleados().get(index).getCedula();
		rows[1] = Empresa.getInstance().getEmpleados().get(index).getNombre();
		rows[2] = Empresa.getInstance().getEmpleados().get(index).getApellido();
		rows[3] = Empresa.getInstance().getEmpleados().get(index).getSalario();
		rows[4] = Empresa.getInstance().getEmpleados().get(index).getClass().getSimpleName();
		
		return rows;
		
	}
}
