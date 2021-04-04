package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
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
import javax.swing.JComponent;
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
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Contrato dialog = new Contrato(frame);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 * @param actionListener 
	 */
	public Contrato() {
		setBounds(100, 100, 650, 329);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(5, 5, 624, 240);
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 255, 255));
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Contrato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 0, 599, 228);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("# Contrato");
			lblNewLabel.setBounds(62, 17, 96, 14);
			panel_1.add(lblNewLabel);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3.setBackground(new Color(255, 255, 255));
			panel_3.setBounds(62, 83, 476, 134);
			panel_1.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("Cedula");
			lblNewLabel_2.setBounds(10, 35, 61, 14);
			panel_3.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Nombre");
			lblNewLabel_3.setBounds(239, 36, 61, 14);
			panel_3.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Telefono");
			lblNewLabel_4.setBounds(10, 84, 61, 14);
			panel_3.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Direccion");
			lblNewLabel_5.setBounds(164, 84, 61, 14);
			panel_3.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("Cant. P");
			lblNewLabel_6.setBounds(391, 83, 55, 17);
			panel_3.add(lblNewLabel_6);
			
			textField = new JTextField();
			textField.setBounds(68, 33, 86, 20);
			panel_3.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(68, 81, 86, 20);
			panel_3.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(220, 81, 161, 20);
			panel_3.add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(295, 33, 86, 20);
			panel_3.add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setBounds(443, 81, 23, 20);
			panel_3.add(textField_4);
			textField_4.setColumns(10);
			
			JButton btnNewButton = new JButton("B");
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(204, 204, 204));
			btnNewButton.setBounds(164, 32, 46, 31);
			panel_3.add(btnNewButton);
			
			textField_5 = new JTextField();
			textField_5.setBounds(136, 14, 184, 20);
			panel_1.add(textField_5);
			textField_5.setColumns(10);
			
			JLabel label = new JLabel("Nombre");
			label.setBounds(330, 17, 72, 14);
			panel_1.add(label);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(384, 14, 154, 20);
			panel_1.add(textField_6);
			
			JLabel label_1 = new JLabel("Fecha Inicio");
			label_1.setBounds(120, 55, 86, 14);
			panel_1.add(label_1);
			
			JLabel label_2 = new JLabel("Fecha Entrega");
			label_2.setBounds(324, 55, 72, 14);
			panel_1.add(label_2);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(202, 52, 86, 20);
			panel_1.add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(406, 52, 86, 20);
			panel_1.add(textField_8);
		}
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(0, 245, 634, 45);
		contentPanel.add(panel);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setBorderPainted(false);
		button.setBackground(new Color(51, 102, 153));
		button.setBounds(535, 0, 89, 45);
		panel.add(button);
		
		JButton button_1 = new JButton("Insertar");
		button_1.setForeground(Color.WHITE);
		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(51, 102, 153));
		button_1.setBounds(436, 0, 89, 45);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Atr\u00E1s");
		button_2.setForeground(Color.WHITE);
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(51, 102, 153));
		button_2.setBounds(337, 0, 89, 45);
		panel.add(button_2);
	}

}
