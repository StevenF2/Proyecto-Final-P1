package logico;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
	
	private ArrayList <Empleado> empleados;
	private String nombre;
	private String tipo;
	private Boolean estado;
	private Boolean extendido;
	private Date fechaInicio;
	private Date fechaEntrega;
	private Date fechaTerminacionReal;
	
	public Proyecto(String nombre, String tipo, Boolean estado, Boolean extendido,
			Date fechaInicio, Date fechaEntrega, Date fechaTerminacionReal) {
		super();
		this.empleados = new ArrayList <Empleado>();
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = estado;
		this.extendido = extendido;
		this.fechaInicio = fechaInicio;
		this.fechaEntrega = fechaEntrega;
		this.fechaTerminacionReal = fechaTerminacionReal;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Boolean getExtendido() {
		return extendido;
	}

	public void setExtendido(Boolean extendido) {
		this.extendido = extendido;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaTerminacionReal() {
		return fechaTerminacionReal;
	}

	public void setFechaTerminacionReal(Date fechaTerminacionReal) {
		this.fechaTerminacionReal = fechaTerminacionReal;
	}
	
	
	


}
