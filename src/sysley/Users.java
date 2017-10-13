package sysley;

import javafx.scene.control.TextField;

    public class Users {
	public String UserName;
	public String UserLastName;
	public String UserBirth;
	public String UserPP;
	public String UserParl;
	public String UserTag;
	public String UserPass;
	public boolean UserAd;
	private Ley leyPrestada;
	private Reglamento regPrestado;
	private Ley leyLote;
	ArregloQueue<Reglamento> reglamentosLote = new ArregloQueue(5);
	public Users(String UserTag,String UserPass,String UserName,String UserLastName,String UserBirth,String UserPP,String UserParl) {
		this.UserName = UserName;
		this.UserLastName = UserLastName;
		this.UserBirth = UserBirth;
		this.UserPP = UserPP;
		this.UserParl = UserParl;
		this.UserTag = UserTag;
		this.UserPass = UserPass;
	}
	
	public String getUserPass() {
		return UserPass;
	}

	public void setUserPass(String userPass) {
		UserPass = userPass;
	}

	public boolean isUserAd() {
		return UserAd;
	}

	public void setUserAd(boolean userAd) {
		UserAd = userAd;
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



	public void setUserTag(String userTag) {
		UserTag = userTag;
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

