package Proyecto_v2;

public class SolicitudReglamento {
	private int idReg;
	private User usuario;
	private int idSolicitud;
	public SolicitudReglamento(int id, User usuario, int idSolicitud) {
		super();
		this.idReg = id;
		this.usuario = usuario;
		this.idSolicitud = idSolicitud;
	}
	public int getIdReg() {
		return idReg;
	}
	public void setIdReg(int id) {
		this.idReg = id;
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
