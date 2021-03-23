package logico;

public class Programador extends Empleado {
	
	private String lenguaje;

	public Programador(String cedula, String nombre, String apellido, String direccion, String telefono, String sexo, float salario,
			String nombreProyecto, String evaluacion, float precioHora, String lenguaje) {
		super(cedula, nombre, apellido, direccion, telefono,sexo, salario, nombreProyecto, evaluacion, precioHora);
		
		this.lenguaje = lenguaje;
	}
	
	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	@Override
	public void modificarNombreProyecto() {
		

	}

}
