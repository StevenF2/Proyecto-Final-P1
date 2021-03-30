package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contrato extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Contrato dialog = new Contrato();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Contrato() {
		setBounds(100, 100, 650, 484);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(51, 102, 153));
		panel_6.setBounds(0, 402, 634, 45);
		contentPanel.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBackground(new Color(51, 102, 153));
		btnCancelar.setBounds(535, 0, 89, 45);
		panel_6.add(btnCancelar);
		
		JButton btnNewButton_2 = new JButton("Insertar");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnCancelar.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(51, 102, 153));
		btnNewButton_2.setBounds(436, 0, 89, 45);
		panel_6.add(btnNewButton_2);
		{
			JPanel panel = new JPanel();
			panel.setBounds(5, 5, 624, 442);
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 255, 255));
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Contrato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 0, 599, 171);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("# Contrato");
			lblNewLabel.setBounds(100, 17, 96, 14);
			panel_1.add(lblNewLabel);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3.setBackground(new Color(255, 255, 255));
			panel_3.setBounds(60, 48, 476, 109);
			panel_1.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("Cedula");
			lblNewLabel_2.setBounds(10, 36, 61, 14);
			panel_3.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Nombre");
			lblNewLabel_3.setBounds(239, 36, 61, 14);
			panel_3.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Telefono");
			lblNewLabel_4.setBounds(10, 76, 61, 14);
			panel_3.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Direccion");
			lblNewLabel_5.setBounds(164, 76, 61, 14);
			panel_3.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("Cant. P");
			lblNewLabel_6.setBounds(391, 76, 55, 17);
			panel_3.add(lblNewLabel_6);
			
			textField = new JTextField();
			textField.setBounds(68, 33, 86, 20);
			panel_3.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(66, 73, 86, 20);
			panel_3.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(220, 73, 161, 20);
			panel_3.add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(295, 33, 86, 20);
			panel_3.add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setBounds(443, 73, 23, 20);
			panel_3.add(textField_4);
			textField_4.setColumns(10);
			
			JButton btnNewButton = new JButton("B");
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(204, 204, 204));
			btnNewButton.setBounds(164, 32, 46, 31);
			panel_3.add(btnNewButton);
			
			textField_5 = new JTextField();
			textField_5.setBounds(206, 14, 184, 20);
			panel_1.add(textField_5);
			textField_5.setColumns(10);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Proyecto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_2.setBackground(new Color(255, 255, 255));
			panel_2.setBounds(10, 169, 599, 229);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("Nombre");
			lblNewLabel_1.setBounds(10, 24, 72, 14);
			panel_2.add(lblNewLabel_1);
			
			textField_6 = new JTextField();
			textField_6.setBounds(92, 21, 86, 20);
			panel_2.add(textField_6);
			textField_6.setColumns(10);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(255, 255, 255));
			panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_4.setBounds(71, 49, 300, 169);
			panel_2.add(panel_4);
			panel_4.setLayout(null);
			
			JButton btnNewButton_1 = new JButton("B");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					AgregarEmpleado emp = new AgregarEmpleado();
					emp.setModal(true);
					emp.setVisible(true);
				}
			});
			btnNewButton_1.setBorderPainted(false);
			btnNewButton_1.setBackground(new Color(204, 204, 204));
			btnNewButton_1.setBounds(201, 11, 89, 34);
			panel_4.add(btnNewButton_1);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBounds(10, 56, 280, 102);
			panel_4.add(panel_5);
			panel_5.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			panel_5.add(scrollPane, BorderLayout.CENTER);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
					{null, null},
				},
				new String[] {
					"Nombre", "Puesto"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, true
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setResizable(false);
			scrollPane.setViewportView(table);
			
			JLabel lblNewLabel_7 = new JLabel("Fecha Inicio");
			lblNewLabel_7.setBounds(214, 24, 86, 14);
			panel_2.add(lblNewLabel_7);
			
			textField_7 = new JTextField();
			textField_7.setBounds(296, 21, 86, 20);
			panel_2.add(textField_7);
			textField_7.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Fecha Entrega");
			lblNewLabel_8.setBounds(418, 24, 72, 14);
			panel_2.add(lblNewLabel_8);
			
			textField_8 = new JTextField();
			textField_8.setBounds(500, 21, 86, 20);
			panel_2.add(textField_8);
			textField_8.setColumns(10);
			
			JLabel lblNewLabel_9 = new JLabel("Tipo");
			lblNewLabel_9.setBounds(388, 106, 46, 14);
			panel_2.add(lblNewLabel_9);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(new Color(255, 255, 255));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
			comboBox.setBounds(442, 103, 86, 20);
			panel_2.add(comboBox);
		}
	}
}
