package logico;

import java.util.ArrayList;

public class Empresa {

	private ArrayList <Cliente> clientes;
	private ArrayList <Contrato> contratos;
	private ArrayList <Empleado> empleados;
	private ArrayList <Proyecto> proyectos;
	private static Empresa empresa = null;
	private static int numClientes = 1;
	private static int numContratos = 1;
	private static int numEmpleados = 1;
	private static int numProyectos = 1;
	
	public Empresa() {
		super();
		this.clientes = new ArrayList <Cliente>();
		this.contratos = new ArrayList <Contrato>();
		this.empleados = new ArrayList <Empleado>();
		this.proyectos = new ArrayList <Proyecto>();
	}
	
	public Empresa getInstance() {
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
			if(aux.getNumeroContrato().equalsIgnoreCase(codigo)) {
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
}
