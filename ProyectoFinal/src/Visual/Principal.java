package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dimension;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		//>setBounds(100, 100, 1016, 496);
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Insertar Empleado");
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/icons/add.png")));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Empleado emp = new Empleado();
				emp.setModal(true);
				emp.setVisible(true);
			}
		});
		mntmNewMenuItem.setForeground(new Color(51, 102, 153));
		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Mostrar Empleado");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarEmpleado emp = new MostrarEmpleado();
				emp.setModal(true);
				emp.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setForeground(new Color(51, 102, 153));
		mntmNewMenuItem_1.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Proyecto & Contrato");
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Crear Proyecto");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proyecto pro = new Proyecto();
				pro.setModal(true);
				pro.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(Principal.class.getResource("/icons/add.png")));
		mntmNewMenuItem_2.setForeground(new Color(51, 102, 153));
		mntmNewMenuItem_2.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Mostrar Proyectos");
		mntmNewMenuItem_3.setForeground(new Color(51, 102, 153));
		mntmNewMenuItem_3.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Mostrar Contratos");
		mntmNewMenuItem_4.setForeground(new Color(51, 102, 153));
		mntmNewMenuItem_4.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Cliente");
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Mostrar Cliente");
		mntmNewMenuItem_5.setForeground(new Color(51, 102, 153));
		mntmNewMenuItem_5.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Administrador");
		mnNewMenu_3.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
	}
}
