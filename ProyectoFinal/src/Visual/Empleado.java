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
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JFormattedTextField;

public class Empleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel panel_5;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Empleado dialog = new Empleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Empleado() {
		setBounds(100, 100, 684, 491);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Informacion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 648, 240);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(10, 24, 67, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(249, 24, 62, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Telefono");
		lblNewLabel_1.setFont(new Font("Kartika", Font.PLAIN, 9));
		lblNewLabel_1.setBounds(10, 74, 67, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setFont(new Font("Kartika", Font.PLAIN, 9));
		lblNewLabel_3.setBounds(249, 74, 62, 14);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Personal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 102, 153)));
		panel_1.setBounds(66, 115, 208, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setForeground(new Color(51, 102, 153));
		rdbtnNewRadioButton.setBounds(50, 25, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setForeground(new Color(51, 102, 153));
		rdbtnNewRadioButton_1.setBounds(50, 70, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setBounds(66, 21, 173, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(305, 21, 333, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 71, 173, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(305, 71, 333, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setForeground(new Color(51, 102, 153));
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(340, 115, 242, 113);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(74, 82, 153, 20);
		panel_3.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(74, 51, 153, 20);
		panel_3.add(spinner_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(74, 20, 152, 20);
		panel_3.add(comboBox);
		
		JLabel lblDesempeo = new JLabel("Desempe\u00F1o");
		lblDesempeo.setBounds(14, 23, 67, 14);
		panel_3.add(lblDesempeo);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(14, 54, 67, 14);
		panel_3.add(lblSalario);
		
		JLabel lblPagoXHora = new JLabel("Pago x hora");
		lblPagoXHora.setBounds(14, 85, 67, 14);
		panel_3.add(lblPagoXHora);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Tipo Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 262, 648, 141);
		contentPanel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_2.add(tabbedPane, BorderLayout.CENTER);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)));
		panel_5.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Jefe", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Cantidad de Trabajadores");
		lblNewLabel_4.setBounds(170, 41, 148, 14);
		panel_5.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(337, 38, 86, 20);
		panel_5.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)));
		tabbedPane.addTab("Programador", null, panel_7, null);
		tabbedPane.setBackgroundAt(1, new Color(255, 255, 255));
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Lenguaje:");
		lblNewLabel_5.setBounds(140, 40, 71, 14);
		panel_7.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(239, 37, 86, 20);
		panel_7.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)));
		tabbedPane.addTab("Planificador", null, panel_8, null);
		tabbedPane.setBackgroundAt(2, new Color(255, 255, 255));
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Frecuencia de Reuniones:");
		lblNewLabel_6.setBounds(176, 36, 150, 14);
		panel_8.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(352, 33, 86, 20);
		panel_8.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 102, 153));
		panel_4.setBounds(0, 407, 668, 44);
		contentPanel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 102, 153));
		btnNewButton.setBounds(569, 0, 89, 44);
		panel_4.add(btnNewButton);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBorderPainted(false);
		btnInsertar.setForeground(new Color(255, 255, 255));
		btnInsertar.setBackground(new Color(51, 102, 153));
		btnInsertar.setBounds(480, 0, 89, 44);
		panel_4.add(btnInsertar);
	}
}
