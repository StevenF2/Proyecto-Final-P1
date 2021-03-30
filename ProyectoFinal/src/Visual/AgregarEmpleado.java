package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class AgregarEmpleado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarEmpleado dialog = new AgregarEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarEmpleado() {
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
					panel_1.add(scrollPane, BorderLayout.CENTER);
					{
						table = new JTable();
						table.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null},
								{null, null},
								{null, null},
							},
							new String[] {
								"Nombre", "Puesto"
							}
						));
						scrollPane.setViewportView(table);
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
					panel_1.add(scrollPane, BorderLayout.CENTER);
					{
						table_1 = new JTable();
						table_1.setModel(new DefaultTableModel(
							new Object[][] {
								{null, null},
								{null, null},
							},
							new String[] {
								"Nombre", "Puesto"
							}
						));
						scrollPane.setViewportView(table_1);
					}
				}
			}
			{
				JButton btnNewButton = new JButton(">");
				btnNewButton.setBorderPainted(false);
				btnNewButton.setBackground(new Color(204, 204, 204));
				btnNewButton.setBounds(285, 110, 58, 39);
				panel.add(btnNewButton);
			}
			{
				JButton button = new JButton("<");
				button.setBorderPainted(false);
				button.setBackground(new Color(204, 204, 204));
				button.setBounds(284, 160, 58, 39);
				panel.add(button);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(51, 102, 153));
			panel.setBounds(0, 340, 632, 47);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JButton btnNewButton_1 = new JButton("Cancelar");
				btnNewButton_1.setForeground(new Color(255, 255, 255));
				btnNewButton_1.setBackground(new Color(51, 102, 153));
				btnNewButton_1.setBorderPainted(false);
				btnNewButton_1.setBounds(533, 0, 89, 47);
				panel.add(btnNewButton_1);
			}
			{
				JButton btnNewButton_2 = new JButton("Insertar");
				btnNewButton_2.setForeground(new Color(255, 255, 255));
				btnNewButton_2.setBackground(new Color(51, 102, 153));
				btnNewButton_2.setBorderPainted(false);
				btnNewButton_2.setBounds(434, 0, 89, 47);
				panel.add(btnNewButton_2);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("Lista Empleados");
			lblNewLabel.setBounds(10, 16, 168, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Empleados en proyecto");
			lblNewLabel_1.setBounds(363, 16, 168, 14);
			contentPanel.add(lblNewLabel_1);
		}
	}

}
