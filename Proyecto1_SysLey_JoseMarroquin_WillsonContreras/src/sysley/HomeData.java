package sysley;

public class HomeData {

	public static ArregloList<Parlamento> parlamentos = new ArregloList<>(100);
	public static ArregloQueue<SolicitudLey> solicitudesDeLeyes = new ArregloQueue<>(100);
	public static ArregloQueue<SolicitudReglamento> solicitudesDeReglamentos = new ArregloQueue<>(100);
	public static ArregloQueue<SolicitudLote> solicitudesDeLote = new ArregloQueue<>(100);
	public static ArregloList<Ley> leyes = new ArregloList<>(100);
	public static ArregloList<Reglamento> reglamentos =  new ArregloList<>(100);
	public static int contL = 0;
	public static int contR = 0;
	public static int contP = 0;
	public static int contU = 0;
	public static ArregloList<Parlamento> getParlamentos() {
		return parlamentos;
	}
	public static void setParlamentos(ArregloList<Parlamento> parlamentos) {
		HomeData.parlamentos = parlamentos;
	}
	public static ArregloQueue<SolicitudLey> getSolicitudesDeLeyes() {
		return solicitudesDeLeyes;
	}
	public static void setSolicitudesDeLeyes(ArregloQueue<SolicitudLey> solicitudesDeLeyes) {
		HomeData.solicitudesDeLeyes = solicitudesDeLeyes;
	}
	public static ArregloQueue<SolicitudReglamento> getSolicitudesDeReglamentos() {
		return solicitudesDeReglamentos;
	}
	public static void setSolicitudesDeReglamentos(ArregloQueue<SolicitudReglamento> solicitudesDeReglamentos) {
		HomeData.solicitudesDeReglamentos = solicitudesDeReglamentos;
	}
	public static ArregloQueue<SolicitudLote> getSolicitudesDeLote() {
		return solicitudesDeLote;
	}
	public static void setSolicitudesDeLote(ArregloQueue<SolicitudLote> solicitudesDeLote) {
		HomeData.solicitudesDeLote = solicitudesDeLote;
	}
	public static ArregloList<Ley> getLeyes() {
		return leyes;
	}
	public static void setLeyes(ArregloList<Ley> leyes) {
		HomeData.leyes = leyes;
	}
	public static ArregloList<Reglamento> getReglamentos() {
		return reglamentos;
	}
	public static void setReglamentos(ArregloList<Reglamento> reglamentos) {
		HomeData.reglamentos = reglamentos;
	}
	public static int getContL() {
		return contL;
	}
	public static void setContL(int contL) {
		HomeData.contL = contL;
	}
	public static int getContR() {
		return contR;
	}
	public static void setContR(int contR) {
		HomeData.contR = contR;
	}
	public static int getContP() {
		return contP;
	}
	public static void setContP(int contP) {
		HomeData.contP = contP;
	}
	public static int getContU() {
		return contU;
	}
	public static void setContU(int contU) {
		HomeData.contU = contU;
	}
	
}
