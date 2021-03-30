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
		setBounds(100, 100, 1016, 496);
		//dimension = super.getToolkit().getScreenSize();
		//super.setSize(dimension.width, dimension.height);
		setLocationRelativeTo(null);
		setBackground(SystemColor.window);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1000, 39);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(51, 102, 153));
		menuBar.setBounds(0, 0, 1000, 39);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Empleado");
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setBackground(new Color(51, 102, 153));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Crear Empleado");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Empleado empleado = new Empleado();
				empleado.setModal(true);
				empleado.setVisible(true);
			}
		});
		mntmNewMenuItem.setForeground(new Color(0, 51, 102));
		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Mostrar Empleado");
		mntmNewMenuItem_1.setForeground(new Color(0, 51, 102));
		mntmNewMenuItem_1.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Contrato");
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_1.setBackground(new Color(51, 102, 153));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Crear Contrato");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contrato contrato = new Contrato();
				contrato.setModal(true);
				contrato.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setBackground(new Color(51, 102, 153));
		mntmNewMenuItem_4.setForeground(new Color(255, 255, 255));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Mostrar Contrato");
		mntmNewMenuItem_5.setBackground(new Color(51, 102, 153));
		mntmNewMenuItem_5.setForeground(new Color(255, 255, 255));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("Proyecto");
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.setBackground(new Color(51, 102, 153));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Mostrar Proyecto");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 37, 1000, 415);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
	}
}
