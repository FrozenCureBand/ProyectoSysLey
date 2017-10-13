package sysley;

public class SolicitudReglamento {
	private int idReg;
	private Users usuario;
	private int idSolicitud;
	public SolicitudReglamento(int id, Users usuario, int idSolicitud) {
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
