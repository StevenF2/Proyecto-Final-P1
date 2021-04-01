package logico;

public class Disenador extends Empleado {
	
	private int experiencia;
	public Disenador(String cedula, String nombre, String apellido, String direccion,String telefono, String sexo, float salario,
			String nombreProyecto, String evaluacion, float precioHora) {
		super(cedula, nombre, apellido, direccion,telefono, sexo, salario, nombreProyecto, evaluacion, precioHora);
		
	}
	
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public void modificarNombreProyecto() {
		

	}

}
