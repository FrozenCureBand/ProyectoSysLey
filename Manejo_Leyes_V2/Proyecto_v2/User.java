package Proyecto_v2;

public class User {

	private String UserName;
	private String UserLastName;
	private String UserBirth;
	private String UserPP;
	private String UserParl;
	private String UserTag;
	private Ley leyPrestada;
	private Reglamento regPrestado;
	private Ley leyLote;
	ArregloQueue<Reglamento> reglamentosLote = new ArregloQueue(5);
	
	
	public User(String UserName,String UserLastName,String UserBirth,String UserPP,String UserParl, String UserTag) {
		this.UserName = UserName;
		this.UserLastName = UserLastName;
		this.UserBirth = UserBirth;
		this.UserPP = UserPP;
		this.UserParl = UserParl;
		this.UserTag = UserTag;
	}
	public String getUserName() {
		return UserName;
	}
	
	public String getUserLastName() {
		return UserLastName;
	}
	
	public String getUserBirth() {
		return UserBirth;
	}
	
	public String getUserTag() {
		return UserTag;
	}
	public String getUserPP() {
		return UserPP;
	}
	
	public String getUserParl() {
		return UserParl;
	}
	
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	
	public void setUserLastName(String UserLastName) {
		this.UserLastName = UserLastName;
	}
	
	public void setUserBirth(String UserBirth) {
		this.UserBirth = UserBirth;
	}
	
	public void setUserPP(String UserPP) {
		this.UserPP = UserPP;
	}
	
	public void setUserParl(String UserParl) {
		this.UserParl = UserParl;
	}
	public void setUserTag(String userTag) {
		UserTag = userTag;
	}
	public Ley getLeyPrestada() {
		return leyPrestada;
	}
	public void setLeyPrestada(Ley leyPrestada) {
		this.leyPrestada = leyPrestada;
	}
	public Reglamento getRegPrestado() {
		return regPrestado;
	}
	public void setRegPrestado(Reglamento regPrestado) {
		this.regPrestado = regPrestado;
	}
	public Ley getLeyLote() {
		return leyLote;
	}
	public void setLeyLote(Ley leyLote) {
		this.leyLote = leyLote;
	}
	
}
