package logico;

import java.util.ArrayList;

public class Proyecto {
	
	private String nombre;
	private ArrayList <Empleado> empleados;
	
	public Proyecto(String nombre, ArrayList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
