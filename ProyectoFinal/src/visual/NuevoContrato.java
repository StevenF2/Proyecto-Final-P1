package visual;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import logico.Cliente;
import logico.Contrato;
import logico.Empleado;
import logico.Empresa;
import logico.Proyecto;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class NuevoContrato extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtNombre;
	private JTextField txtCantidad;
	private JTextField txtId;
	private JTextField txtNombreP;
	private JTextField txtCedula;
	private static Boolean cExiste = false;
	private Cliente cExistente = null;
	private JTextField txtTotal;
	private long daysBetween;
	private float montoTotalContrato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoContrato dialog = new NuevoContrato();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} 

	/**
	 * Create the dialog.
	 * @param actionListener 
	 */
	public NuevoContrato() {
		setBounds(100, 100, 650, 420);
		setLocationRelativeTo(null);
		/* Calcular numero de dias entre las fecha inicial e final del contrato */
		DateFormat dtf = new SimpleDateFormat("dd MM yyyy");
		String inicio = dtf.format(Empresa.getInicio());
		String finalFecha = dtf.format(Empresa.getFin());
		DateTimeFormatter dtF = DateTimeFormatter.ofPattern("dd MM yyyy");
		try {
			LocalDate fecha1 = LocalDate.parse(inicio, dtF);
			LocalDate fecha2 = LocalDate.parse(finalFecha, dtF);
			daysBetween = ChronoUnit.DAYS.between(fecha1, fecha2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/**/
		this.montoTotalContrato = Empresa.getInstance().calcularMontoTotalContrato(daysBetween, Empresa.getTemp());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(5, 5, 624, 321);
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel);
			panel.setLayout(null);

			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 255, 255));
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Contrato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 0, 599, 321);
			panel.add(panel_1);
			panel_1.setLayout(null);

			JLabel lblNewLabel = new JLabel("Id. Contrato");
			lblNewLabel.setBounds(31, 42, 96, 14);
			panel_1.add(lblNewLabel);

			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Informacion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3.setBackground(new Color(255, 255, 255));
			panel_3.setBounds(60, 77, 490, 145);
			panel_1.add(panel_3);
			panel_3.setLayout(null);

			JLabel lblNewLabel_2 = new JLabel("Cedula");
			lblNewLabel_2.setBounds(10, 36, 61, 14);
			panel_3.add(lblNewLabel_2);

			JLabel lblNewLabel_4 = new JLabel("Telefono");
			lblNewLabel_4.setBounds(10, 84, 61, 14);
			panel_3.add(lblNewLabel_4);

			JLabel lblNewLabel_5 = new JLabel("Direccion");
			lblNewLabel_5.setBounds(296, 81, 61, 14);
			panel_3.add(lblNewLabel_5);

			JLabel lblNewLabel_6 = new JLabel("Proyectos Activos");
			lblNewLabel_6.setBounds(126, 117, 125, 17);
			panel_3.add(lblNewLabel_6);

			txtTelefono = new JTextField();
			txtTelefono.setEditable(false);
			txtTelefono.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					if (prevenirLetras(e)) {
						e.consume();
					}
				}
			});
			txtTelefono.setBounds(68, 81, 121, 20);
			panel_3.add(txtTelefono);
			txtTelefono.setColumns(10);

			txtDireccion = new JTextField();
			txtDireccion.setEditable(false);
			txtDireccion.setBounds(357, 78, 123, 20);
			panel_3.add(txtDireccion);
			txtDireccion.setColumns(10);

			txtCantidad = new JTextField();
			txtCantidad.setEditable(false);
			txtCantidad.setBounds(230, 115, 37, 20);
			panel_3.add(txtCantidad);
			txtCantidad.setColumns(10);
			txtCantidad.setText("");

			txtCedula = new JTextField();
			txtCedula.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					if (prevenirLetras(e)) {
						e.consume();
					}
				}
			});
			txtCedula.setColumns(10);
			txtCedula.setBounds(68, 33, 125, 20);
			panel_3.add(txtCedula);

			JLabel lblNewLabel_3 = new JLabel("Nombre");
			lblNewLabel_3.setBounds(296, 33, 61, 14);
			panel_3.add(lblNewLabel_3);

			txtNombre = new JTextField();
			txtNombre.setEditable(false);
			txtNombre.setBounds(355, 30, 125, 20);
			panel_3.add(txtNombre);
			txtNombre.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					if (prevenirDigitos(e)) {
						e.consume();
					}
				}
			});
			txtNombre.setColumns(10);

			JButton btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon(NuevoContrato.class.getResource("/icons/loupe (2).png")));
			btnNewButton.setBounds(203, 28, 83, 31);
			panel_3.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					String cedula = txtCedula.getText();
					Cliente c = buscarCliente(cedula);
					cExistente = c;

					if(txtCedula.getText().isEmpty()) {

						JOptionPane.showMessageDialog(null,  "Favor introducir el identificador del cliente", "Aviso", JOptionPane.INFORMATION_MESSAGE);

					} 

					if(c == null && !txtCedula.getText().isEmpty()) {

						JOptionPane.showMessageDialog(null,  "El cliente no se encuentra registrado en la base de datos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
						txtNombre.setEditable(true);
						txtTelefono.setEditable(true);
						txtDireccion.setEditable(true);
						txtCantidad.setText("0");


					}else {

						txtNombre.setText(""+c.getNombre());
						txtNombre.setEditable(false);
						txtCedula.setText(""+c.getCedula());
						txtCedula.setEditable(false);
						txtTelefono.setText(""+c.getTelefono());
						txtTelefono.setEditable(false);
						txtDireccion.setText(""+c.getDireccion());
						txtDireccion.setEditable(false);
						txtCantidad.setText(""+c.getCantiProyectos());		
						cExiste = true;


					}


				}
			});
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(Color.WHITE);

			txtId = new JTextField();
			txtId.setEnabled(false);
			txtId.setText(String.valueOf(Empresa.getInstance().getContratos().size() + 1));
			txtId.setBounds(101, 39, 160, 20);
			panel_1.add(txtId);
			txtId.setColumns(10);

			JLabel lblIdCliente = new JLabel("Nombre del Proyecto");
			lblIdCliente.setBounds(280, 42, 129, 14);
			panel_1.add(lblIdCliente);

			txtNombreP = new JTextField();
			txtNombreP.setText(Empresa.getNombre());
			txtNombreP.setEnabled(false);
			txtNombreP.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					if (prevenirDigitos(e)) {
						e.consume();
					}
				}
			});
			txtNombreP.setColumns(10);
			txtNombreP.setBounds(409, 39, 160, 20);
			panel_1.add(txtNombreP);

			JLabel lblNewLabel_7 = new JLabel("Monto Total");
			lblNewLabel_7.setBounds(355, 281, 90, 14);
			panel_1.add(lblNewLabel_7);

			txtTotal = new JTextField();
			txtTotal.setEditable(false);
			txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtTotal.setBounds(440, 271, 129, 35);
			panel_1.add(txtTotal);
			txtTotal.setColumns(10);
			txtTotal.setText(""+this.montoTotalContrato+"$RD");
		}

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(0, 337, 634, 45);
		contentPanel.add(panel);

		JButton btnAtras = new JButton("");
		btnAtras.setIcon(new ImageIcon(NuevoContrato.class.getResource("/icons/previous.png")));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dispose();
				setVisible(false);
				NuevoProyecto p = new NuevoProyecto();
				p.setVisible(true);
				p.setLocationRelativeTo(null);
				Empresa.setEnable(true);
				NuevoProyecto.datosAnteriores();


			}
		});
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBorderPainted(false);
		btnAtras.setBackground(new Color(51, 102, 153));
		btnAtras.setBounds(423, 0, 89, 45);
		panel.add(btnAtras);

		JButton btnFinalizar = new JButton("");
		btnFinalizar.setIcon(new ImageIcon(NuevoContrato.class.getResource("/icons/diskette (1).png")));
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(informacionLlena()) {

						int idContrato = Integer.parseInt(txtId.getText());
						String nombreP = txtNombreP.getText();
						String nombre = txtNombre.getText();
						String cedula = txtCedula.getText();
						String telefono = txtTelefono.getText();
						String direccion = txtDireccion.getText();
						int cantidad = 0;

						if(cExiste == true) {

							cantidad = Integer.parseInt(txtCantidad.getText());

						}else {

							cantidad = 1;

						}
						if(cExiste == true && cantidad == 5 ) {

							JOptionPane.showMessageDialog(null,  "No es posible completar la accion, el cliente cuenta con la cantidad maxima de proyectos activos", "Aviso", JOptionPane.INFORMATION_MESSAGE);


						}

						String tipo = null;
						String lenguaje = null;

						switch (Empresa.getTipo()) {

						case 0: tipo = "Web";
						break;

						case 1: tipo = "Desktop";
						break;

						case 2: tipo = "Movil";
						break;
						}

						switch (Empresa.getLenguaje()) {

						case 0: lenguaje = "Python";
						break;

						case 1: lenguaje = "C#";
						break;

						case 2: lenguaje = "JavaScrypt";
						break;

						case 3: lenguaje = "Ruby";
						break;

						case 4: lenguaje = "C++";
						break;

						case 5: lenguaje = "C";
						break;

						case 6: lenguaje = "Java";
						break;

						case 7: lenguaje = "Angular";
						break;
						}

						//Si el cliente ya existe, no se puede agregar un nuevo cliente
						//Hacer que cantiPoyectos aumente cada vez que un mismo cliente hace un contrato nuevo
						//Limitar a 5 la cantidad de proyectos
						//Automatizar los codigos id de proyectos y contratos


						Cliente cli = new Cliente(cedula, nombre, direccion, telefono);
						Proyecto p = new Proyecto(nombreP, tipo, true, lenguaje, false, Empresa.getInicio(), Empresa.getFin(), Empresa.getFin(), Empresa.getTemp());
						Contrato c = new Contrato(idContrato, cedula, nombreP, cli, p, montoTotalContrato);

						if(cExiste == true) {

							clienteNuevoPoyecto(cExistente,p,c);
							//JOptionPane.showMessageDialog(null,  "Se ha agregado un nuevo proyecto satisfactoriamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
							cExiste = false;
							cExistente = null;
							dispose();

						}else {

							Empresa.getInstance().insertarCliente(cli);
							//Empresa.getInstance().insertarContrato(c);
							//Empresa.getInstance().insertarProyecto(p);

						}
						Empresa.getInstance().insertarContrato(c);
						Empresa.getInstance().insertarProyecto(p);
						JOptionPane.showMessageDialog(null,  "Se ha agregado un nuevo proyecto satisfactoriamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
						dispose();

						System.out.println(Empresa.getInstance().getClientes().get(0).getNombre());
						Principal.cargarProyectosEnFechaEntrega();

					}else {

						JOptionPane.showMessageDialog(null,  "Debe llenar todas las casillas", "Aviso", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Aviso", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		btnFinalizar.setForeground(Color.WHITE);
		btnFinalizar.setBorderPainted(false);
		btnFinalizar.setBackground(new Color(51, 102, 153));
		btnFinalizar.setBounds(522, 0, 89, 45);
		panel.add(btnFinalizar);
	}

	protected Cliente buscarCliente(String cedula) {
		Cliente c = null;
		ArrayList <Cliente> aux = Empresa.getInstance().getClientes();

		for(Cliente cl: aux) {
			if(cl.getCedula().equalsIgnoreCase(cedula)) {
				c = cl;
				return c;
			}
		}
		return c;

	}

	public void clienteNuevoPoyecto(Cliente c, Proyecto p, Contrato co) {

		//Empresa.getInstance().insertarProyecto(p);

		for(Cliente cli : Empresa.getInstance().getClientes()) {

			if(c == cli) {

				cli.getContratos().add(co);
				cli.setCantiProyectos(cli.getCantiProyectos()+1);

			}
		}		
	}

	private boolean prevenirDigitos(KeyEvent arg0) {
		if (!Character.isLetter(arg0.getKeyChar()) && !(arg0.getKeyChar() == KeyEvent.VK_SPACE) && !(arg0.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
			JOptionPane.showMessageDialog(null, "Solo debe insertar Letras", "Informacion", JOptionPane.WARNING_MESSAGE);
			return true;
		}
		return false;
	}
	private boolean prevenirLetras(KeyEvent arg0) {
		if (!Character.isDigit(arg0.getKeyChar()) && !(arg0.getKeyChar() == KeyEvent.VK_SPACE) && !(arg0.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
			JOptionPane.showMessageDialog(null, "Solo debe insertar numeros", "Informacion", JOptionPane.WARNING_MESSAGE);
			return true;
		}
		return false;
	}

	private boolean informacionLlena() {
		if(txtNombreP.getText().isEmpty() || txtId.getText().isEmpty() || txtCedula.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCantidad.getText().isEmpty()) {
			return false;
		} 
		return true;
	}
}
