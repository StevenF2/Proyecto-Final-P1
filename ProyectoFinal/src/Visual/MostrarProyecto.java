package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.Contrato;
import logico.Disenador;
import logico.Empresa;
import logico.Jefe;
import logico.Planificador;
import logico.Programador;
import logico.Proyecto;
import logico.Secretario;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.swing.ScrollPaneConstants;

public class MostrarProyecto extends JDialog {
	private JButton btnCancelar;
	private JTable tblMostrarProyecto;
	private static DefaultTableModel model;
	private static Object[] rows;
	private JComboBox cmbEstado;
	private String[] proyectos;
	private JButton btnProrroga;
	private JButton btnFinalizar;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			MostrarProyecto dialog = new MostrarProyecto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public MostrarProyecto() {
		setBounds(100, 100, 670, 462);
		setLocationRelativeTo(null);
		this.proyectos = new String[5];
		String columns[] = {"Nombre", "Tipo", "Lenguaje", "Fecha Inicio", "Fecha Terminacion"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		getContentPane().setLayout(null);
		{
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 380, 654, 43);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			panel_1.setBackground(new Color(51, 102, 153));
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnCancelar.setForeground(Color.WHITE);
				btnCancelar.setBackground(new Color(51, 102, 153));
				btnCancelar.setBounds(565, 0, 89, 43);
				panel_1.add(btnCancelar);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(null);
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 654, 380);
			getContentPane().add(panel);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 102, 153), new Color(51, 102, 153)), "Mostrar Usuarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(10, 11, 634, 358);
				panel.add(panel_1);
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBackground(Color.WHITE);
					panel_2.setBounds(10, 63, 614, 284);
					panel_1.add(panel_2);
					panel_2.setLayout(new BorderLayout(0, 0));
					{
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						panel_2.add(scrollPane, BorderLayout.NORTH);
						{
							tblMostrarProyecto = new JTable();
							tblMostrarProyecto.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseClicked(MouseEvent arg0) {
									int seleccion = -1;
									seleccion = tblMostrarProyecto.getSelectedRow();
									if(seleccion > -1) {
										proyectos[0] = tblMostrarProyecto.getValueAt(seleccion, 0).toString();
										proyectos[1] = tblMostrarProyecto.getValueAt(seleccion, 1).toString();
										proyectos[2] = tblMostrarProyecto.getValueAt(seleccion, 2).toString();
										proyectos[3] = tblMostrarProyecto.getValueAt(seleccion, 3).toString();
										proyectos[4] = tblMostrarProyecto.getValueAt(seleccion, 4).toString();
										btnFinalizar.setEnabled(true);
										btnProrroga.setEnabled(true);
										//btnInsertarEmpleado.setEnabled(true);
									}
								}
							});
							tblMostrarProyecto.setModel(model);
							tblMostrarProyecto.getTableHeader().setReorderingAllowed(false);
							scrollPane.setViewportView(tblMostrarProyecto);
						}
					}
				}
				
				JLabel lblNewLabel = new JLabel("Estado:");
				lblNewLabel.setBounds(10, 38, 74, 14);
				panel_1.add(lblNewLabel);
				
				cmbEstado = new JComboBox();
				cmbEstado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cargarEmpleados(cmbEstado.getSelectedItem().toString());
					}
				});
				cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"Todo", "En Proceso", "Finalizado"}));
				cmbEstado.setBounds(73, 32, 115, 20);
				panel_1.add(cmbEstado);
				
				btnFinalizar = new JButton("Finalizar");
				btnFinalizar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Proyecto pro = Empresa.getInstance().buscarProyecto(proyectos[0]);
						if(pro != null) {
							try {
								pro.setEstado(false);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null, "Ocurrio un error", "Informacion", JOptionPane.ERROR_MESSAGE);
							}
							JOptionPane.showMessageDialog(null, "Proyecto Finalizado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				});
				btnFinalizar.setEnabled(false);
				btnFinalizar.setForeground(new Color(0, 0, 0));
				btnFinalizar.setBorderPainted(false);
				btnFinalizar.setBackground(new Color(204, 204, 204));
				btnFinalizar.setBounds(535, 22, 89, 30);
				panel_1.add(btnFinalizar);
				
				btnProrroga = new JButton("Prorroga");
				btnProrroga.setForeground(new Color(0, 0, 0));
				btnProrroga.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						CambiarFecha cambiarFecha = new CambiarFecha(proyectos[0],proyectos[4]);
						cambiarFecha.setModal(true);
						cambiarFecha.setVisible(true);
						cargarEmpleados(cmbEstado.getSelectedItem().toString());
					}
				});
				btnProrroga.setEnabled(false);
				btnProrroga.setBorderPainted(false);
				btnProrroga.setBackground(new Color(204, 204, 204));
				btnProrroga.setBounds(436, 22, 89, 30);
				panel_1.add(btnProrroga);
			}
		}
		cargarEmpleados(cmbEstado.getSelectedItem().toString());
	}
	public static void cargarEmpleados(String selectedItem) {
		model.setRowCount(0);
		for(int i = 0; i < Empresa.getInstance().getProyectos().size(); i++) {
			if(selectedItem.equalsIgnoreCase("En Proceso")) {
				if(Empresa.getInstance().getProyectos().get(i).getEstado() == true) {
					model.addRow(insertInRow(i));
				}
			} else if (selectedItem.equalsIgnoreCase("Finalizado")) {
				if(Empresa.getInstance().getProyectos().get(i).getEstado() == false) {
					model.addRow(insertInRow(i));
				}
			}else if (selectedItem.equalsIgnoreCase("Todo")) {
				model.addRow(insertInRow(i));
			}
		}
	}
	
	private static Object[] insertInRow(int index) {
		rows = new Object[model.getColumnCount()];
		rows[0] = Empresa.getInstance().getProyectos().get(index).getNombre();
		rows[1] = Empresa.getInstance().getProyectos().get(index).getTipo();
		rows[2] = Empresa.getInstance().getProyectos().get(index).getLenguaje();
		rows[3] = Empresa.getInstance().getProyectos().get(index).getFechaInicio();
		rows[4] = Empresa.getInstance().getProyectos().get(index).getFechaEntrega();
		
		return rows;
		
	}
}
