package logico;

public class Secretario extends Empleado {

	private int experiencia;
	public Secretario(String cedula, String nombre, String apellido, String direccion, String telefono, String sexo,
			float salario, String nombreProyecto, String evaluacion, float precioHora, int experiencia) {
		super(cedula, nombre, apellido, direccion, telefono, sexo, salario, nombreProyecto, evaluacion, precioHora);
		// TODO Auto-generated constructor stub
		this.experiencia = experiencia;
	}

	
	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	@Override
	public void modificarNombreProyecto() {
		// TODO Auto-generated method stub

	}

}
