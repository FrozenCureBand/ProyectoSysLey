package sysley;

public class SolicitudLey {

	private int idLey;
	private Users usuario;
	private int idSolicitud;
	public SolicitudLey(int idLey, Users usuario, int idSolicitud) {
		super();
		this.idLey = idLey;
		this.usuario = usuario;
		this.idSolicitud = idSolicitud;
	}
	public int getIdLey() {
		return idLey;
	}
	public void setIdLey(int idLey) {
		this.idLey = idLey;
	}
	public Users getUsuario() {
		return usuario;
	}
	public void setUsuario(Users usuario) {
		this.usuario = usuario;
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	
	
}
