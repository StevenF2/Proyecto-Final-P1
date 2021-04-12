package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Empresa;
import logico.Proyecto;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import graficos.Pastel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dimension;
	private JMenuItem menuCEmpleado;
	private JMenuItem menuMEmpleado;
	private JMenuItem menuCProyecto;
	private JMenuItem menuMProyecto;
	private JMenuItem menuMContrato;
	private JMenuItem menuMCliente;
	private JMenuItem menuCUsuarios;
	private JMenuItem menuMUsuarios;
	private JMenu menuAdministrador;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Principal() {
		//>setBounds(100, 100, 1016, 496);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FileOutputStream empresa2;
				ObjectOutputStream empresaWrite;
				try {
					empresa2 = new  FileOutputStream("empresa.dat");
					empresaWrite = new ObjectOutputStream(empresa2);
					empresaWrite.writeObject(Empresa.getInstance());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		dimension = super.getToolkit().getScreenSize();
		super.setSize(dimension.width, dimension.height);
		setLocationRelativeTo(null);
		setBackground(SystemColor.window);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		//menuBar.setSize(dimension.width, dimension.width-100);
		menuBar.setToolTipText("Men\u00FA de Opciones");
		menuBar.setBackground(new Color(51, 102, 153));
		menuBar.setForeground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Empleado");
		mnNewMenu.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		menuCEmpleado = new JMenuItem("Insertar Empleado");
		menuCEmpleado.setIcon(new ImageIcon(Principal.class.getResource("/icons/add.png")));
		menuCEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Empleado emp = new Empleado();
				emp.setModal(true);
				emp.setVisible(true);
			}
		});
		menuCEmpleado.setForeground(new Color(51, 102, 153));
		menuCEmpleado.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(menuCEmpleado);
		
		menuMEmpleado = new JMenuItem("Mostrar Empleado");
		menuMEmpleado.setIcon(new ImageIcon(Principal.class.getResource("/icons/list (1).png")));
		menuMEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarEmpleado emp = new MostrarEmpleado();
				emp.setModal(true);
				emp.setVisible(true);
			}
		});
		menuMEmpleado.setForeground(new Color(51, 102, 153));
		menuMEmpleado.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(menuMEmpleado);
		
		JMenu mnNewMenu_1 = new JMenu("Proyecto & Contrato");
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_1);
		
		menuCProyecto = new JMenuItem("Crear Proyecto");
		menuCProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevoProyecto pro = new NuevoProyecto();
				pro.setModal(true);
				pro.setVisible(true);
			}
		});
		menuCProyecto.setIcon(new ImageIcon(Principal.class.getResource("/icons/add.png")));
		menuCProyecto.setForeground(new Color(51, 102, 153));
		menuCProyecto.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(menuCProyecto);
		
		menuMProyecto = new JMenuItem("Mostrar Proyectos");
		menuMProyecto.setIcon(new ImageIcon(Principal.class.getResource("/icons/list (1).png")));
		menuMProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarProyecto mProyecto = new MostrarProyecto();
				mProyecto.setModal(true);
				mProyecto.setVisible(true);
			}
		});
		menuMProyecto.setForeground(new Color(51, 102, 153));
		menuMProyecto.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(menuMProyecto);
		
		menuMContrato = new JMenuItem("Mostrar Contratos");
		menuMContrato.setIcon(new ImageIcon(Principal.class.getResource("/icons/list (1).png")));
		menuMContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MostrarContrato mCont = new MostrarContrato();
				mCont.setModal(true);
				mCont.setVisible(true);
			}
		});
		menuMContrato.setForeground(new Color(51, 102, 153));
		menuMContrato.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(menuMContrato);
		
		JMenu mnNewMenu_2 = new JMenu("Cliente");
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_2);
		
		menuMCliente = new JMenuItem("Mostrar Cliente");
		menuMCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MostrarCliente m = new MostrarCliente();
				m.setVisible(true);
				;
			}
		});
		menuMCliente.setIcon(new ImageIcon(Principal.class.getResource("/icons/list (1).png")));
		menuMCliente.setForeground(new Color(51, 102, 153));
		menuMCliente.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.add(menuMCliente);
		
		menuAdministrador = new JMenu("Administrador");
		menuAdministrador.setForeground(new Color(255, 255, 255));
		menuBar.add(menuAdministrador);
		
		menuCUsuarios = new JMenuItem("Crear Usuarios");
		menuCUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/icons/add.png")));
		menuCUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NuevoUsuario user = new NuevoUsuario();
				user.setModal(true);
				user.setVisible(true);
			}
		});
		menuAdministrador.add(menuCUsuarios);
		
		menuMUsuarios = new JMenuItem("Mostrar Usuarios");
		menuMUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/icons/list (1).png")));
		menuMUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarUsuarios userMostrar = new MostrarUsuarios();
				userMostrar.setModal(true);
				userMostrar.setVisible(true);
			}
		});
		menuAdministrador.add(menuMUsuarios);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		if(Empresa.getLoginUser().getTipo().equalsIgnoreCase("Secretario")) {
			menuCEmpleado.setEnabled(false);
			menuMProyecto.setEnabled(false);
			menuCProyecto.setEnabled(false);
			menuCUsuarios.setEnabled(false);
			menuAdministrador.setEnabled(false);
		}
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(76, 38, 413, 300);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//init();
        
		DefaultPieDataset data = new DefaultPieDataset();
		float python = 0;
		float	cnumero = 0;
		float javascript = 0;
		float ruby = 0;
		float cplusplus = 0;
		float c = 0;
		float java = 0;
		float angular = 0;
		
		for(Proyecto p : Empresa.getInstance().getProyectos()) {
			
			switch(p.getLenguaje()) {
			
			case "Python":
				python++;
				break;
		
			case "C#":
				cnumero++;
				break;
				
			case "JavaScript":
				javascript++;
				break;
				
			case "Ruby":
				ruby++;
				break;
				
			case "C++":
				cplusplus++;
				break;
				
			case "C":
				c++;
				break;
				
			case "Java":
				java++;
				break;
				
			case "Angular":
				angular++;
				break;
			
			}
		}
		
		int size = Empresa.getInstance().getProyectos().size();
		
        data.setValue("Python", (python));
        data.setValue("C#", (cnumero));
        data.setValue("JavaScript", (javascript));
        data.setValue("Ruby", (ruby));
        data.setValue("C++", (cplusplus));
        data.setValue("C", (c));
        data.setValue("Java", (java));
        data.setValue("Angular", (angular));
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Proyectos Activos", 
         data, 
         true, 
         true, 
         false);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setSize(413, 300);
		chartPanel.setLocation(0, 0);
        panel_1.add(chartPanel);
      
		
		
	}
	
	/* private void init() {
	       
	        // Fuente de Datos
	        
	 
	        // Crear el Panel del Grafico con ChartPanel
	        
	    } */
}
