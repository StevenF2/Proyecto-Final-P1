package logico;


public class Contrato {
	private String numeroContrato;
	private String cedulaCliente;
	private String nombreProyecto; //se puede cambiar a tipo proyecto, a espera de la siguiente clase
	private float montoTotal;
	private float penalidad;
	private static int cantidadContrato = 1;
	public Contrato(String numeroContrato, String cedulaCliente, String nombreProyecto) {
		super();
		this.numeroContrato = numeroContrato;
		this.cedulaCliente = cedulaCliente;
		this.nombreProyecto = nombreProyecto;
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
	public static int getCantidadContrato() {
		return cantidadContrato;
	}
	public static void setCantidadContrato(int cantidadContrato) {
		Contrato.cantidadContrato = cantidadContrato;
	}
	public float getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}
	public float getPenalidad() {
		return penalidad;
	}
	public void setPenalidad(float penalidad) {
		this.penalidad = penalidad;
	}
	
}
