package logico;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

public class Empresa {

	private ArrayList <Cliente> clientes;
	private ArrayList <Contrato> contratos;
	private ArrayList <Empleado> empleados;
	private ArrayList <Proyecto> proyectos;
	private ArrayList<User> usuarios;
	private static Empresa empresa = null;
	private static int numClientes = 1;
	private static int numContratos = 1;
	private static int numEmpleados = 1;
	private static int numProyectos = 1;
	private static int codigo = 0;
	private static int tipo = 0;
	private static int lenguaje = 0;
	private static String nombre = null;
	private static Date inicio = null;
	private static Date fin = null;
	private static ArrayList <Empleado> temp = null;
	private static Proyecto ptemp = null;
	private static Boolean enable = false;
	
	public Empresa() {
		super();
		this.clientes = new ArrayList <Cliente>();
		this.contratos = new ArrayList <Contrato>();
		this.empleados = new ArrayList <Empleado>();
		this.proyectos = new ArrayList <Proyecto>();
		this.usuarios = new ArrayList<User>();
	}
	
	public static Empresa getInstance() {
		if(empresa == null) {
			
			empresa = new Empresa();
		}
		
		return empresa;
		
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(ArrayList<Contrato> contratos) {
		this.contratos = contratos;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(ArrayList<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public static Empresa getEmpresa() {
		return empresa;
	}

	public static void setEmpresa(Empresa empresa) {
		Empresa.empresa = empresa;
	}

	public static int getNumClientes() {
		return numClientes;
	}

	public static void setNumClientes(int numClientes) {
		Empresa.numClientes = numClientes;
	}

	public static int getNumContratos() {
		return numContratos;
	}

	public static void setNumContratos(int numContratos) {
		Empresa.numContratos = numContratos;
	}

	public static int getNumEmpleados() {
		return numEmpleados;
	}

	public static void setNumEmpleados(int numEmpleados) {
		Empresa.numEmpleados = numEmpleados;
	}

	public static int getNumProyectos() {
		return numProyectos;
	}

	public static void setNumProyectos(int numProyectos) {
		Empresa.numProyectos = numProyectos;
	}
	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Empresa.codigo = codigo;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Empresa.nombre = nombre;
	}

	public static Date getInicio() {
		return inicio;
	}

	public static void setInicio(Date inicio) {
		Empresa.inicio = inicio;
	}

	public static Date getFin() {
		return fin;
	}

	public static void setFin(Date fin) {
		Empresa.fin = fin;
	}

	public static ArrayList<Empleado> getTemp() {
		return temp;
	}

	public static void setTemp(ArrayList<Empleado> temp) {
		Empresa.temp = temp;
	}

	public static Proyecto getPtemp() {
		return ptemp;
	}

	public static void setPtemp(Proyecto ptemp) {
		Empresa.ptemp = ptemp;
	}

	public static int getTipo() {
		return tipo;
	}

	public static void setTipo(int tipo) {
		Empresa.tipo = tipo;
	}

	public static int getLenguaje() {
		return lenguaje;
	}

	public static void setLenguaje(int lenguaje) {
		Empresa.lenguaje = lenguaje;
	}

	public static Boolean getEnable() {
		return enable;
	}

	public static void setEnable(Boolean enable) {
		Empresa.enable = enable;
	}

	/**
	 * Funciones insertar
	 * */
	public void insertarEmpleado(Empleado emp) {
		this.empleados.add(emp);
	}
	
	public void insertarContrato(Contrato cont) {
		this.contratos.add(cont);
		numContratos++;
	}
	
	public void insertarProyecto(Proyecto pro) {
		this.proyectos.add(pro);
		numProyectos++;
	}
	
	public void insertarCliente(Cliente cli) {
		this.clientes.add(cli);
		numClientes++;
	}
	
	public boolean insetarUsuario(User user) {
		if(checkSiExisteUser(user.getNombreUsuario())) {
			this.usuarios.add(user);
			return true;
		}
		return false;
	}
	/**
	 * Debo de probar las funciones de buscar y modificarNombreProyecto lo haré mañana 26/3/21
	 * Att: Tu compañera :3
	 * */
	public Cliente buscarCliente(String cedula) {
		Cliente cli = null;
		for(Cliente aux: this.clientes) {
			if(aux.getCedula().equalsIgnoreCase(cedula)) {
				cli = aux;
				return cli;
			}
		}
		return cli;
	}
	public Contrato buscarContrato(String codigo) {
		Contrato cont = null;
		for(Contrato aux: this.contratos) {
			if((""+aux.getNumeroContrato()).equalsIgnoreCase(codigo)) {
				cont = aux;
				return cont;
			}
		}
		return cont;
	}
	public Proyecto buscarProyecto(String nombre) {
		Proyecto pro = null;
		for(Proyecto aux: this.proyectos) {
			if(aux.getNombre().equalsIgnoreCase(nombre)) {
				pro = aux;
				return pro;
			}
		}
		return pro;
	}
	
	public Empleado buscarEmpleado(String cedula) {
		Empleado emp = null;
		for(Empleado aux: this.empleados) {
			if(aux.getCedula().equalsIgnoreCase(cedula)) {
				emp = aux;
				return emp;
			}
		}
		return emp;
	}
	
	public ArrayList<Empleado> buscarEmpleadoPorLenguaje(String lenguaje) {
		Empleado emp = null;
		ArrayList<Empleado> empA = new ArrayList<Empleado>();
		Programador pro = null;
		for(Empleado aux: this.empleados) {
			if(aux instanceof Programador) {
				pro = (Programador) aux; 
				if(pro.getLenguaje().contains(lenguaje)) {
					empA.add(pro);
				}
			} else if(!(aux instanceof Programador)) {
				empA.add(aux);
			}
		}
		return empA;
	}
	
	public void modificarNombreProyecto(Proyecto pro) {
		String nombre = pro.getNombre();
		for(Empleado aux: pro.getEmpleados()) {
			aux.setNombreProyecto(nombre);
		}
	}
	
	public boolean checkSiExisteUser(String usuario) {
		for(User aux: this.usuarios) {
			if(aux.getNombreUsuario().equalsIgnoreCase(usuario)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkUserData(String nombreUsuario, String passwordUsuario) {
		for(User aux: this.usuarios) {
			if(aux.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && aux.getPasswordUsuario().equalsIgnoreCase(passwordUsuario)) {
				return true;
			}
		}
		return false;
	}
	
}
