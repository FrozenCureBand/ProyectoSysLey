package Proyecto_v2;

public class SolicitudLey {

	private int idLey;
	private User usuario;
	private int idSolicitud;
	public SolicitudLey(int idLey, User usuario, int idSolicitud) {
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
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	
	
}
