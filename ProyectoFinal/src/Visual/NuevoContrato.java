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
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class NuevoContrato extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtNombre;
	private JTextField txtCantidad;
	private JTextField txtId;
	private JTextField txtNombreP;
	private JTextField txtBusqueda;
	private JTextField txtCedula;
	private static Boolean cExiste = false;
	private Cliente cExistente = null;
	private JTextField txtTotal;
	private static float total = 0;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			NuevoContrato dialog = new NuevoContrato();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} */

	/**
	 * Create the dialog.
	 * @param actionListener 
	 */
	public NuevoContrato() {
		setBounds(100, 100, 650, 420);
		setLocationRelativeTo(null);
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
			panel_3.setBounds(62, 115, 490, 145);
			panel_1.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("Cedula");
			lblNewLabel_2.setBounds(251, 36, 61, 14);
			panel_3.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Nombre");
			lblNewLabel_3.setBounds(10, 36, 61, 14);
			panel_3.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Telefono");
			lblNewLabel_4.setBounds(10, 84, 61, 14);
			panel_3.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Direccion");
			lblNewLabel_5.setBounds(251, 84, 61, 14);
			panel_3.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("Proyectos Activos");
			lblNewLabel_6.setBounds(126, 117, 125, 17);
			panel_3.add(lblNewLabel_6);
			
			txtTelefono = new JTextField();
			txtTelefono.setBounds(68, 81, 121, 20);
			panel_3.add(txtTelefono);
			txtTelefono.setColumns(10);
			
			txtDireccion = new JTextField();
			txtDireccion.setBounds(312, 81, 123, 20);
			panel_3.add(txtDireccion);
			txtDireccion.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(68, 33, 125, 20);
			panel_3.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtCantidad = new JTextField();
			txtCantidad.setEditable(false);
			txtCantidad.setBounds(230, 115, 37, 20);
			panel_3.add(txtCantidad);
			txtCantidad.setColumns(10);
			txtCantidad.setText("");
			
			txtCedula = new JTextField();
			txtCedula.setColumns(10);
			txtCedula.setBounds(310, 33, 125, 20);
			panel_3.add(txtCedula);
			
			txtId = new JTextField();
			txtId.setBounds(101, 39, 160, 20);
			panel_1.add(txtId);
			txtId.setColumns(10);
			
			JLabel lblIdCliente = new JLabel("Nombre del Proyecto");
			lblIdCliente.setBounds(280, 42, 129, 14);
			panel_1.add(lblIdCliente);
			
			txtNombreP = new JTextField();
			txtNombreP.setColumns(10);
			txtNombreP.setBounds(409, 39, 160, 20);
			panel_1.add(txtNombreP);
			
			JLabel lblNewLabel_1 = new JLabel("Busqueda Cliente");
			lblNewLabel_1.setBounds(101, 92, 130, 14);
			panel_1.add(lblNewLabel_1);
			
			txtBusqueda = new JTextField();
			txtBusqueda.setColumns(10);
			txtBusqueda.setBounds(205, 89, 160, 20);
			panel_1.add(txtBusqueda);
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String cedula = txtBusqueda.getText();
					Cliente c = buscarCliente(cedula);
					cExistente = c;
					System.out.println(cedula);
					if(txtBusqueda.getText().isEmpty()) {
						
						JOptionPane.showMessageDialog(null,  "Favor introducir el identificador del cliente deseado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
						
					} 
					
					if(c == null && !txtBusqueda.getText().isEmpty()) {
						
						JOptionPane.showMessageDialog(null,  "No se ha encontrado un cliente con el identificador introducido", "Aviso", JOptionPane.INFORMATION_MESSAGE);

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
			btnNewButton.setBounds(375, 84, 96, 31);
			panel_1.add(btnNewButton);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(204, 204, 204));
			
			JLabel lblNewLabel_7 = new JLabel("Monto Total");
			lblNewLabel_7.setBounds(355, 281, 90, 14);
			panel_1.add(lblNewLabel_7);
			
			txtTotal = new JTextField();
			txtTotal.setEditable(false);
			txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
			txtTotal.setBounds(440, 271, 129, 35);
			panel_1.add(txtTotal);
			txtTotal.setColumns(10);
			txtTotal.setText(""+calcularTotal()+"$RD");
		}
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(0, 337, 634, 45);
		contentPanel.add(panel);
		
		JButton btnAtras = new JButton("Atras");
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
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
				Contrato c = new Contrato(idContrato, cedula, nombreP, cli, p);
				/**
				 * private ArrayList <Empleado> empleados;
					private String nombre;
					private String tipo;
					private Boolean estado;
					private String lenguaje;
					private Boolean extendido;
					private Date fechaInicio;
					private Date fechaEntrega;
					private Date fechaTerminacionReal;
				 */
				if(cExiste == true) {
					
					clienteNuevoPoyecto(cExistente,p,c);
					JOptionPane.showMessageDialog(null,  "Se ha agregado un nuevo proyecto satisfactoriamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
					cExiste = false;
					cExistente = null;
					dispose();
					
				}else {
				
				Empresa.getInstance().insertarCliente(cli);
				Empresa.getInstance().insertarContrato(c);
				Empresa.getInstance().insertarProyecto(p);
				
				}
				
				JOptionPane.showMessageDialog(null,  "Se ha agregado un nuevo proyecto satisfactoriamente ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
				dispose();
				
				System.out.println(Empresa.getInstance().getClientes().get(0).getNombre());
				
			}
		});
		btnFinalizar.setForeground(Color.WHITE);
		btnFinalizar.setBorderPainted(false);
		btnFinalizar.setBackground(new Color(51, 102, 153));
		btnFinalizar.setBounds(522, 0, 89, 45);
		panel.add(btnFinalizar);
		
		/*JButton button_2 = new JButton("Atr\u00E1s");
		button_2.setForeground(Color.WHITE);
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(51, 102, 153));
		button_2.setBounds(337, 0, 89, 45);
		panel.add(button_2);*/
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
		
		Empresa.getInstance().insertarProyecto(p);
		
		for(Cliente cli : Empresa.getInstance().getClientes()) {
			
			if(c == cli) {
				
				cli.getContratos().add(co);
				cli.setCantiProyectos(cli.getCantiProyectos()+1);
				
			}
		}		
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for(Empleado e : Empresa.getTemp()) {			
			
			total += Math.round(e.getSalario()*100)/100;						
		}				
		
		return total;
	}
}
