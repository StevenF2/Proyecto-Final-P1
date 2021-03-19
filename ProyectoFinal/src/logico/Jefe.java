package logico;

public class Jefe extends Empleado {

	private int cantiTrabajadores;
	
	public Jefe(String cedula, String nombre, String apellido, String direccion, String sexo, float salario,
			String nombreProyecto, String evaluacion, float precioHora, int cantiTrabajadores) {
		super(cedula, nombre, apellido, direccion, sexo, salario, nombreProyecto, evaluacion, precioHora);
		
		this.cantiTrabajadores = cantiTrabajadores;
	}

	
	public int getCantiTrabajadores() {
		return cantiTrabajadores;
	}


	public void setCantiTrabajadores(int cantiTrabajadores) {
		this.cantiTrabajadores = cantiTrabajadores;
	}


	@Override
	public void modificarNombreProyecto() {
		

	}

}
