package sysley;

public class Reglamento {

	private String nombre;
	ArregloQueue<Reglamento> copias = new ArregloQueue(10);
	private double id;
	private int idLey;
	private boolean disponible;
	public Reglamento(String nombre, double id, int idLey) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.idLey = idLey;
	}
	public Reglamento() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public double getIdLey() {
		return idLey;
	}
	public void setIdLey(int idLey) {
		this.idLey = idLey;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public void crearCopias() {
		double f = 0.1;
		int n = 1;
		for(int i = 0; i < 5; i++) {
			Reglamento LT = new Reglamento();
			LT.setNombre("C"+ n +"." + nombre);
			LT.setId(id + f);
			LT.setDisponible(true);
			LT.setIdLey(idLey);
			copias.enqueue(LT);
			f = f + 0.1;
			n++;
		}
	}
	@Override
	public String toString() {
		return "Reglamento [nombre=" + nombre + ", identificador=" + id + ", idLey=" + idLey + ", disponible=" + disponible + "]";
	}
	
	public void mostrarCopias() {
		ArregloQueue<Reglamento> copiasTemp = new ArregloQueue(5);
		Reglamento LT = new Reglamento();
		for(int i = 0; i < 5; i++) {
			if(copias.first() != null) {
				LT = copias.dequeue();
				System.out.println("Reglamento [nombre=" + LT.getNombre() + ", identificador=" + LT.getId() + " idLey=" + LT.getIdLey() +", disponible=" + LT.isDisponible() + "]");
				copiasTemp.enqueue(LT);
			}
		}
		copias = copiasTemp;
	}
}
