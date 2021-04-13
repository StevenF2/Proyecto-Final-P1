package visual;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import logico.Empresa;
import logico.Empleado;

import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AgregarEmpleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tblListaEmpleados;
	private JTable tblEmpleadosProyecto;
	private JLabel lblLenguajeProyecto;
	private String nombreLenguaje;
	private static DefaultTableModel model, modelAceptado;
	private static Object[] rows, rowsAceptados;
	private String[] empleados;
	private JButton btnInsertarEmpleado;
	private JButton btnRegresarEmpleado;
	private int empleadosIndex;
	private JButton btnInsertarEmpleados;
	private JButton btnCancelar;
	/**
	 * Launch the application.
	 */
	//hola
	/*public static void main(String[] args) {
		try {
			AgregarEmpleado dialog = new AgregarEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 * @param string 
	 */
	public AgregarEmpleado(String string) {
		setTitle("Agregar Empleado");
		this.nombreLenguaje = string;
		this.empleados = new String[3];
		this.empleadosIndex = 0;
		String columnas[] = {"Cedula", "Nombre", "Puesto"};
		model = new DefaultTableModel();
		modelAceptado = new DefaultTableModel();
		model.setColumnIdentifiers(columnas);
		modelAceptado.setColumnIdentifiers(columnas);
		setBounds(100, 100, 648, 426);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 41, 632, 298);
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(255, 255, 255));
				panel_1.setBounds(10, 11, 259, 277);
				panel.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
					panel_1.add(scrollPane, BorderLayout.CENTER);
					{
						tblListaEmpleados = new JTable();
						tblListaEmpleados.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								int seleccion = -1;
								seleccion = tblListaEmpleados.getSelectedRow();
								if(seleccion > -1) {
									empleados[0] = tblListaEmpleados.getValueAt(seleccion, 0).toString();
									empleados[1] = tblListaEmpleados.getValueAt(seleccion, 1).toString();
									empleados[2] = tblListaEmpleados.getValueAt(seleccion, 2).toString();
									btnInsertarEmpleado.setEnabled(true);
								}
							}
						});
						tblListaEmpleados.setModel(model);
						scrollPane.setViewportView(tblListaEmpleados);
					}
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(255, 255, 255));
				panel_1.setBounds(363, 11, 259, 277);
				panel.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
					panel_1.add(scrollPane, BorderLayout.CENTER);
					{
						tblEmpleadosProyecto = new JTable();
						tblEmpleadosProyecto.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								int seleccion = -1;
								seleccion = tblEmpleadosProyecto.getSelectedRow();
								if(seleccion > -1) {
									empleadosIndex = seleccion;
									btnRegresarEmpleado.setEnabled(true);
								}
							}
						});
						tblEmpleadosProyecto.setModel(modelAceptado);
						scrollPane.setViewportView(tblEmpleadosProyecto);
					}
				}
			}
			{
				btnInsertarEmpleado = new JButton("");
				btnInsertarEmpleado.setIcon(new ImageIcon(AgregarEmpleado.class.getResource("/icons/right-arrow (1).png")));
				btnInsertarEmpleado.setEnabled(false);
				btnInsertarEmpleado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						rowsAceptados = new Object[modelAceptado.getColumnCount()];
						if(checkElements(empleados[0])) {
							rowsAceptados[0]= empleados[0];
							rowsAceptados[1]= empleados[1];
							rowsAceptados[2] = empleados[2];
							modelAceptado.addRow(rowsAceptados);
						}
						btnInsertarEmpleado.setEnabled(false);
					}
				});
				btnInsertarEmpleado.setBorderPainted(false);
				btnInsertarEmpleado.setBackground(new Color(204, 204, 204));
				btnInsertarEmpleado.setBounds(285, 110, 58, 39);
				panel.add(btnInsertarEmpleado);
			}
			{
				btnRegresarEmpleado = new JButton("");
				btnRegresarEmpleado.setIcon(new ImageIcon(AgregarEmpleado.class.getResource("/icons/previous.png")));
				btnRegresarEmpleado.setEnabled(false);
				btnRegresarEmpleado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						modelAceptado.removeRow(empleadosIndex);
						btnRegresarEmpleado.setEnabled(false);
					}
				});
				btnRegresarEmpleado.setBorderPainted(false);
				btnRegresarEmpleado.setBackground(new Color(204, 204, 204));
				btnRegresarEmpleado.setBounds(284, 160, 58, 39);
				panel.add(btnRegresarEmpleado);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(51, 102, 153));
			panel.setBounds(0, 340, 632, 47);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				btnCancelar = new JButton("");
				btnCancelar.setIcon(new ImageIcon(AgregarEmpleado.class.getResource("/icons/home (2).png")));
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setForeground(new Color(255, 255, 255));
				btnCancelar.setBackground(new Color(51, 102, 153));
				btnCancelar.setBorderPainted(false);
				btnCancelar.setBounds(434, 0, 89, 47);
				panel.add(btnCancelar);
			}
			{
				btnInsertarEmpleados = new JButton("");
				btnInsertarEmpleados.setIcon(new ImageIcon(AgregarEmpleado.class.getResource("/icons/diskette (1).png")));
				btnInsertarEmpleados.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						NuevoProyecto.agregarLenguajeProgramador(modelAceptado);
						tblEmpleadosProyecto.removeAll();
						dispose();
					}
				});
				btnInsertarEmpleados.setForeground(new Color(255, 255, 255));
				btnInsertarEmpleados.setBackground(new Color(51, 102, 153));
				btnInsertarEmpleados.setBorderPainted(false);
				btnInsertarEmpleados.setBounds(533, 0, 89, 47);
				panel.add(btnInsertarEmpleados);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("Lista Empleados");
			lblNewLabel.setBounds(10, 16, 121, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Empleados en proyecto");
			lblNewLabel_1.setBounds(363, 16, 168, 14);
			contentPanel.add(lblNewLabel_1);
		}
		
		JLabel lblNewLabel_2 = new JLabel("Lenguaje:");
		lblNewLabel_2.setBounds(141, 16, 76, 14);
		contentPanel.add(lblNewLabel_2);
		
		lblLenguajeProyecto = new JLabel("...");
		lblLenguajeProyecto.setText(nombreLenguaje);
		lblLenguajeProyecto.setBounds(197, 16, 76, 14);
		contentPanel.add(lblLenguajeProyecto);
		
		cargarEmpleados(nombreLenguaje);
	}
	
	public static void cargarEmpleados(String nombreLenguaje) {
		ArrayList<Empleado> emp2 = new ArrayList<Empleado>();
		emp2.addAll(Empresa.getInstance().buscarEmpleadoPorLenguaje(nombreLenguaje));
		rows = new Object[model.getColumnCount()];
		model.setRowCount(0);
		for(int i = 0; i < emp2.size() ; i++) {
			rows[0] = emp2.get(i).getCedula().toString();
			rows[1] = emp2.get(i).getNombre().toString();
			rows[2] = emp2.get(i).getClass().getSimpleName().toString();
			model.addRow(rows);
		}
	}
	private static boolean checkElements(String elemento) {
		if(modelAceptado.getRowCount() < 0) {
			return true;
		}
		for(int i = 0; i < modelAceptado.getRowCount(); i++) {
			 if(modelAceptado.getValueAt(i, 0).toString().equalsIgnoreCase(elemento)) {
				 return false;
			 }
		}
		return true;
	}
}
