package logico;

public class Disenador extends Empleado {

	public Disenador(String cedula, String nombre, String apellido, String direccion,String telefono, String sexo, float salario,
			String nombreProyecto, String evaluacion, float precioHora) {
		super(cedula, nombre, apellido, direccion,telefono, sexo, salario, nombreProyecto, evaluacion, precioHora);
		
	}

	@Override
	public void modificarNombreProyecto() {
		

	}

}
