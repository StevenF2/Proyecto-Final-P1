package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import logico.Empresa;
import logico.User;

import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreUsuario;
	private JTextField txtPassword;
	private JTextField txtPasswordRepetir;
	private JButton btnInsertarUsuario;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoUsuario dialog = new NuevoUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoUsuario() {
		setBounds(100, 100, 454, 299);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Crear Nuevo Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 418, 195);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre Usuario:");
		lblNewLabel.setBounds(20, 34, 114, 14);
		panel.add(lblNewLabel);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(144, 36, 206, 20);
		panel.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setBounds(20, 95, 99, 14);
		panel.add(lblNewLabel_1);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(144, 92, 206, 20);
		panel.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Repetir Contrase\u00F1a:");
		lblNewLabel_2.setBounds(20, 151, 123, 14);
		panel.add(lblNewLabel_2);
		
		txtPasswordRepetir = new JTextField();
		txtPasswordRepetir.setBounds(144, 148, 206, 20);
		panel.add(txtPasswordRepetir);
		txtPasswordRepetir.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 153));
		panel_1.setBounds(0, 217, 438, 43);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBackground(new Color(51, 102, 153));
		btnCancelar.setBounds(339, 0, 89, 43);
		panel_1.add(btnCancelar);
		
		btnInsertarUsuario = new JButton("Insertar");
		btnInsertarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User nuevoUsuario = null;
				nuevoUsuario = new User("User " +String.valueOf(User.getCodigoUsuario() + 1), txtNombreUsuario.getText(), txtPassword.getText());
				if(!(Empresa.getInstance().insetarUsuario(nuevoUsuario))) {
					JOptionPane.showMessageDialog(null, "Usuario ya insertado", "Informacion", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnInsertarUsuario.setBackground(new Color(51, 102, 153));
		btnInsertarUsuario.setBounds(240, 0, 89, 43);
		panel_1.add(btnInsertarUsuario);
	}
}
