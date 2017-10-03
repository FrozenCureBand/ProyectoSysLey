package Proyecto;
/**
 * 
 * @author Will
 * @version 1.0
 */
public class Ley {
	
	private String nombre;
	public Ley[] copias = new Ley[5];
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
	public Ley[] getCopias() {
		return copias;
	}
	public void setCopias(Ley[] copias) {
		this.copias = copias;
	}
	public void crearCopias(String nom) {
		double f = 0.1;
		int n = 1;
		for(int i = 0; i < 5; i++) {
			copias[i] = new Ley(nom);
			copias[i].setNombre("C"+ n +"." + nombre);
			copias[i].setIdentificador(identificador + f);
			copias[i].setDisponible(true);
			f = f + 0.1;
			n++;
		}
	}
	public String toString() {
		return "Ley [nombre=" + nombre + ", identificador=" + identificador + "]";
	}
	public void mostrarCopias() {
		for(int i = 0; i < 5; i++) {
			if(copias[i] != null) {
				System.out.println("Ley [nombre= " + copias[i].getNombre() + ", identificador= " + copias[i].getIdentificador() + "]");
			}
		}
	}
}
