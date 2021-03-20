package logico;

import java.util.Calendar;

public class Contrato {
	private String numeroContrato;
	private String cedulaCliente;
	private String nombreProyecto; //se puede cambiar a tipo proyecto, a espera de la siguiente clase
	private Calendar fechaInicio;
	private Calendar fechaEntrega;
	private static int cantidadContrato = 1;
	public Contrato(String numeroContrato, String cedulaCliente, String nombreProyecto, Calendar fechaInicio,
			Calendar fechaEntrega) {
		super();
		this.numeroContrato = numeroContrato;
		this.cedulaCliente = cedulaCliente;
		this.nombreProyecto = nombreProyecto;
		this.fechaInicio = fechaInicio;
		this.fechaEntrega = fechaEntrega;
		Contrato.cantidadContrato++;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public Calendar getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Calendar fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public static int getCantidadContrato() {
		return cantidadContrato;
	}
	public static void setCantidadContrato(int cantidadContrato) {
		Contrato.cantidadContrato = cantidadContrato;
	}
	
}
