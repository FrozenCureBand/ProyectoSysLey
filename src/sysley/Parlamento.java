package sysley;

public class Parlamento {

	public Parlamento() {
		
	}
	private String nombre;
	private int id;
	ArregloList<Users> miembros = new ArregloList<>(8);
	ArregloQueue<Ley> leyesPrestadas =  new ArregloQueue(2);
	ArregloQueue<Reglamento> reglamentosPrestados =  new ArregloQueue(2);
	public Parlamento(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
