package Proyecto_v2;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class Ley {
	
	private String nombre;
	ArregloQueue<Ley> copias = new ArregloQueue(5);
	private boolean disponible;
	private double identificador;
	/**
	 * Metodo Constructor para Leyes
	 * @param nombre
	 * @param identificador
	 */
	public Ley(String nombre, double identificador) {
		this.nombre = nombre;
		this.identificador = identificador;
	}
	/**
	 * Metodo constructor para copia de Leyes
	 * @param nombre
	 */
	public Ley(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo Constructor para objetos leyes de valor temporal
	 */
	public Ley() {
		
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getIdentificador() {
		return identificador;
	}
	public void setIdentificador(double identificador) {
		this.identificador = identificador;
	}
	public ArregloQueue<Ley> getCopias() {
		return copias;
	}
	public void setCopias(ArregloQueue<Ley> copias) {
		this.copias = copias;
	}
	public void crearCopias() {
		double f = 0.1;
		int n = 1;
		for(int i = 0; i < 5; i++) {
			Ley LT = new Ley();
			LT.setNombre("C"+ n +"." + nombre);
			LT.setIdentificador(identificador + f);
			LT.setDisponible(true);
			copias.enqueue(LT);
			f = f + 0.1;
			n++;
		}
	}
	public String toString() {
		return "Ley [nombre=" + nombre + ", identificador=" + identificador + ", disponible=" + disponible + "]";
	}
	public void mostrarCopias() {
		ArregloQueue<Ley> copiasTemp = new ArregloQueue(5);
		Ley LT = new Ley();
		for(int i = 0; i < 5; i++) {
			if(copias.first() != null) {
				LT = copias.dequeue();
				System.out.println("Ley [nombre=" + LT.getNombre() + ", identificador=" + LT.getIdentificador() + ", disponible=" + LT.isDisponible() + "]");
				copiasTemp.enqueue(LT);
			}
		}
		copias = copiasTemp;
	}
}
