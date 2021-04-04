package Visual;

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
import javax.swing.border.EtchedBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarUsuarios extends JDialog {
	private JTable tblMostrarUsuarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MostrarUsuarios dialog = new MostrarUsuarios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MostrarUsuarios() {
		setBounds(100, 100, 494, 361);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(51, 102, 153));
			buttonPane.setBounds(0, 279, 478, 43);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton btnNewButton = new JButton("Cancelar");
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
						tblMostrarUsuarios.setBackground(new Color(255, 255, 255));
						scrollPane.setViewportView(tblMostrarUsuarios);
					}
				}
			}
		}
	}
}