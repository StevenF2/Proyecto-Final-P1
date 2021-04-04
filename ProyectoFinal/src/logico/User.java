package logico;

public class User {
	private String codigo;
	private String nombreUsuario;
	private String passwordUsuario;
	private static int codigoUsuario = 1;
	public User(String codigo, String nombreUsuario, String passwordUsuario) {
		super();
		this.codigo = codigo;
		this.nombreUsuario = nombreUsuario;
		this.passwordUsuario = passwordUsuario;
		codigoUsuario++;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPasswordUsuario() {
		return passwordUsuario;
	}
	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
	public static int getCodigoUsuario() {
		return codigoUsuario;
	}
	public static void setCodigoUsuario(int codigoUsuario) {
		User.codigoUsuario = codigoUsuario;
	}
	
}
