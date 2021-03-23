package logico;

import java.util.ArrayList;

public class Cliente {
	private String cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Contrato> contratos;
	private static int cantidadCliente = 1;
	public Cliente(String cedula, String nombre, String direccion, String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contratos = new ArrayList<Contrato>();
		Cliente.cantidadCliente++;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Contrato> getContratos() {
		return contratos;
	}
	public void setContratos(ArrayList<Contrato> contratos) {
		this.contratos = contratos;
	}
	public static int getCantidadCliente() {
		return cantidadCliente;
	}
	public static void setCantidadCliente(int cantidadCliente) {
		Cliente.cantidadCliente = cantidadCliente;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
