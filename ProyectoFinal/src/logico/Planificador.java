package logico;

public class Planificador extends Empleado {
	
	private int frecuenciaTareas;

	public Planificador(String cedula, String nombre, String apellido, String direccion, String sexo, float salario,
			String nombreProyecto, String evaluacion, float precioHora, int frecuenciaTareas) {
		super(cedula, nombre, apellido, direccion, sexo, salario, nombreProyecto, evaluacion, precioHora);
		
		this.frecuenciaTareas = frecuenciaTareas;
	}

	
	public int getFrecuenciaTareas() {
		return frecuenciaTareas;
	}


	public void setFrecuenciaTareas(int frecuenciaTareas) {
		this.frecuenciaTareas = frecuenciaTareas;
	}


	public void modificarNombreProyecto() {
		

	}

}
