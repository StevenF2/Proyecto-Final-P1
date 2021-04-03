package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Proyecto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private static DefaultTableModel model;
	private static Object[] rows;
	private JComboBox cmbLenguajes;
	private JButton btnAgregarEmpleado;
	private JTable tblEmpleadosProyecto;

	/**
	 * Launch the application.
	 */
	//hola
	/*public static void main(String[] args) {
		try {
			Proyecto dialog = new Proyecto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public Proyecto() {
		setBounds(100, 100, 584, 451);
		setLocationRelativeTo(null);
		model = new DefaultTableModel();
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 102, 153));
		panel_3.setBounds(0, 368, 568, 44);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(51, 102, 153));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(469, 0, 89, 44);
		panel_3.add(btnNewButton);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Operacion Satisfactoria", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				 int input = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Eliga una opción ...",JOptionPane.YES_NO_OPTION);

			    // 0=yes, 1=no, 2=cancel
			    System.out.println(input);
			    if(input == 0) {
					setVisible(false);
					Contrato cont = new Contrato();
					cont.setModal(true);
					cont.setVisible(true);
			    } 
			}
		});
		btnSiguiente.setBorderPainted(false);
		btnSiguiente.setBackground(new Color(51, 102, 153));
		btnSiguiente.setForeground(new Color(255, 255, 255));
		btnSiguiente.setBounds(370, 0, 89, 44);
		panel_3.add(btnSiguiente);
		{
			JPanel panel = new JPanel();
			panel.setBounds(5, 5, 558, 365);
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Proyecto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("Nombre");
				label.setBounds(212, 28, 72, 14);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(264, 25, 278, 20);
				panel.add(textField);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBackground(new Color(255, 255, 255));
				panel_1.setBounds(121, 166, 300, 192);
				panel.add(panel_1);
				{
					btnAgregarEmpleado = new JButton("B");
					btnAgregarEmpleado.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							AgregarEmpleado emp = new AgregarEmpleado(cmbLenguajes.getSelectedItem().toString());
							emp.setModal(true);
							emp.setVisible(true);
						}
					});
					btnAgregarEmpleado.setBorderPainted(false);
					btnAgregarEmpleado.setBackground(new Color(204, 204, 204));
					btnAgregarEmpleado.setBounds(201, 11, 89, 34);
					panel_1.add(btnAgregarEmpleado);
				}
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(new Color(255, 255, 255));
					panel_2.setBounds(10, 56, 280, 125);
					panel_1.add(panel_2);
					panel_2.setLayout(new BorderLayout(0, 0));
					
					JScrollPane scrollPane = new JScrollPane();
					panel_2.add(scrollPane, BorderLayout.CENTER);
					
					tblEmpleadosProyecto = new JTable();
					tblEmpleadosProyecto.setModel(model);
					scrollPane.setViewportView(tblEmpleadosProyecto);
				}
			}
			{
				JLabel label = new JLabel("Fecha Inicio");
				label.setBounds(91, 72, 86, 14);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(168, 69, 86, 20);
				panel.add(textField_1);
			}
			{
				JLabel label = new JLabel("Fecha Entrega");
				label.setBounds(264, 72, 87, 14);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(361, 69, 86, 20);
				panel.add(textField_2);
			}
			{
				JLabel label = new JLabel("Tipo");
				label.setBounds(121, 119, 60, 14);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Web", "Desktop", "M\u00F3vil"}));
				comboBox.setBackground(new Color(255, 255, 255));
				comboBox.setBounds(168, 116, 86, 20);
				panel.add(comboBox);
			}
			
			JLabel lblNewLabel = new JLabel("Lenguaje");
			lblNewLabel.setBounds(280, 119, 72, 14);
			panel.add(lblNewLabel);
			
			cmbLenguajes = new JComboBox();
			cmbLenguajes.setBackground(new Color(255, 255, 255));
			cmbLenguajes.setModel(new DefaultComboBoxModel(new String[] {"Python", "C#", "JavaScript", "Ruby", "C++", "C", "Java", "Angular"}));
			cmbLenguajes.setBounds(345, 116, 86, 20);
			panel.add(cmbLenguajes);
			
			JLabel lblNewLabel_1 = new JLabel("Codigo");
			lblNewLabel_1.setBounds(10, 28, 46, 14);
			panel.add(lblNewLabel_1);
			
			textField_3 = new JTextField();
			textField_3.setBounds(52, 25, 150, 20);
			panel.add(textField_3);
			textField_3.setColumns(10);
		}
	}
	
	public static void agregarLenguajeProgramador(DefaultTableModel modelProyecto) {
		String[] empleados = {"Nombre", "Puesto"};
		model.setColumnIdentifiers(empleados);
		rows = new Object[model.getColumnCount()];
		for(int i = 0; i < modelProyecto.getRowCount(); i++) {
			if(checkElements(modelProyecto.getValueAt(i, 0).toString())) {
				rows[0] = modelProyecto.getValueAt(i, 0).toString();
				rows[1] = modelProyecto.getValueAt(i, 1).toString();
				model.addRow(rows);
			}
		}
	}
	private static boolean checkElements(String elemento) {
		if(model.getRowCount() < 0) {
			return true;
		}
		for(int i = 0; i < model.getRowCount(); i++) {
			 if(model.getValueAt(i, 0).toString().equalsIgnoreCase(elemento)) {
				 return false;
			 }
		}
		return true;
	}
}
