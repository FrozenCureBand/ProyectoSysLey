# ProyectoSysLey
Repo proyecto 1 progra avanzada 2017
Jose Marroquin, Williams Monterroso
> Los Spartan nunca mueren, solo se pierden en accion.  — Dra. Elizabeth Catherine Halsey
## Desarrollo
SysLey es un software que permite el manejo de leyes y reglamentos por medio de la creacion de los usuarios que pertenecen a un parlamento. 
### SysLey ver0.0.1
![Imgur](https://i.imgur.com/3z5C5ZE.png)
## Get Started!!
![Imgur](https://i.imgur.com/1kCjLxG.png)
La ventana de Login de SysLey, debera ingresar un usuario y una contrasena registrada en SysLey
## HomePage
![Imgur](https://i.imgur.com/6m19g80.png)
La ventana principal de Sysley, que permitira ingresar a los diferentes 
## Users
![Imgur](https://i.imgur.com/9mvl0eG.png)

## Manejo y Funcionamiento de Leyes y Reglamentos
por cuestiones de tiempo y por problemas de compatibilidad entre java 8 y 9 por parte de los estudiantes
aqui estan los metodos que controlan el prestamo y devolucion de leyes y reglamentos.
<pre><code>
Scanner sc = new Scanner(System.in);
	ArregloQueue<SolicitudLey> solicitudesDeLeyes = new ArregloQueue(100);
	ArregloQueue<SolicitudReglamento> solicitudesDeReglamentos = new ArregloQueue(100);
	ArregloQueue<SolicitudLote> solicitudesDeLote = new ArregloQueue(100);
	ArregloList<Ley> leyes = new ArregloList(100);
	ArregloList<Reglamento> reglamentos =  new ArregloList(100);
	int contL = 0;
	int contR = 0;
	
	public static void main(String[] args) {
		Main2 obj = new Main2();
		obj.crearLey("Proteccion infantil", 1476);
		obj.crearLey("Proteccion Ambiental", 1634);
		obj.crearReglamento("Reg 1 de Proteccion Infantil", 2864, 1476);
		obj.crearReglamento("Reg 2 de Proteccion Infantil", 2865, 1476);
		obj.crearReglamento("Reg 1 de Proteccion Ambiental", 2492, 1634);
		obj.crearReglamento("Reg 2 de Proteccion Ambiental", 2493, 1634);
		obj.mostrarLeyes();
		obj.mostrarReglamentos();
		User us1 = new User("Williams", "Monterroso", "6/1/99", "GANA", "Parlamento1", "1021417");
		obj.crearSolicitudLote(1476, us1, 101);
		obj.prestamoLote(new SolicitudLote(1476, us1, 101));
		if(us1.getLeyLote() != null) {
			System.out.println(us1.getLeyLote().toString());
		}
		
		for(int i = 0; i < 10; i++) {
			if(us1.reglamentosLote.first() != null) {
				System.out.println(us1.reglamentosLote.dequeue().toString());
			}
		}
		obj.devolucionLotes(us1);
		obj.crearSolicitudLey(1476, us1, 102);
		obj.crearSolicitudReglamento(2865, us1, 103);
		obj.prestamoReglamento(new SolicitudReglamento(2865, us1, 103));
		obj.prestamoLey(new SolicitudLey(1476, us1, 102));
		if(us1.getLeyPrestada() != null) {
			System.out.println(us1.getLeyPrestada().toString());
		}
		if(us1.getRegPrestado() != null) {
			System.out.println(us1.getRegPrestado().toString());
		}
		obj.mostrarLeyes();
		obj.mostrarReglamentos();
		obj.devolucionLey(us1);
		obj.devolucionReglamento(us1);
		obj.mostrarLeyes();
		obj.mostrarReglamentos();
	}
	/**
	 * Creacion de Ley
	 * @param nombre String con el nombre de la ley
	 * @param id integer con el identificador de la ley
	 */
	public void crearLey(String nombre, int id) {
		Ley L1 = new Ley(nombre, id);
		L1.crearCopias();
		leyes.add(contL, L1);
		contL++;
		
	}
	/**
	 * Creacion de Reglamento
	 * @param nombre String con el nombre del reglamento
	 * @param id integer con el identificador del reglamento
	 * @param idLey integer con el identificador de la ley relacionada
	 */
	public void crearReglamento(String nombre, int id, int idLey) {
		Reglamento R1 = new Reglamento(nombre, id, idLey);
		R1.crearCopias();
		reglamentos.add(contR, R1);
		contR++;
	}
	/**
	 * Creacion de solicitud de ley
	 * @param id integer con el id de la ley solicitada
	 * @param us Objeto User con el usuario que realiza el prestamo
	 * @param idS integer con el identificador de solicitud
	 */
	public void crearSolicitudLey(int id, User us, int idS) {
		SolicitudLey s1 = new SolicitudLey(id, us, idS);
		solicitudesDeLeyes.enqueue(s1);
	}
	/**
	 * Creacion de Solicitud de reglamento
	 * @param id integer con el id del reglamento solicitado
	 * @param us Objeto User con el usuario que realiza el prestamo
	 * @param idS integer con el identificador de solicitud
	 */
	public void crearSolicitudReglamento(int id, User us, int idS) {
		SolicitudReglamento s1 = new SolicitudReglamento(id, us, idS);
		solicitudesDeReglamentos.enqueue(s1);
	}
	/**
	 * Creacion de solicitud de prestamo por lote
	 * @param id integer con el id de la ley
	 * @param us Objeto user con el usuario que realiza el prestamo
	 * @param idS integer con el identificador de solicitud
	 */
	public void crearSolicitudLote(int id, User us, int idS) {
		SolicitudLote s1 = new SolicitudLote(id, us, idS);
		solicitudesDeLote.enqueue(s1);
	}
	/**
	 * Prestamo de Ley por usuario
	 * @param S1 Objeto de solicitud de prestamo de ley
	 */
	public void prestamoLey(SolicitudLey S1) {
		Ley LT = new Ley();
		if(S1.getUsuario().getLeyPrestada() == null) {
			if((solicitudesDeLeyes.first().getIdSolicitud() == S1.getIdSolicitud()) && (solicitudesDeLeyes.first().getIdLey() == S1.getIdLey())) {
				for(int i = 0; i < leyes.size(); i++) {
					LT = leyes.get(i);
					if(S1.getUsuario().getLeyPrestada() != null) {
						break;
					}
					if(LT.copias.size() != 0) {
						if((Math.floor(LT.copias.first().getIdentificador()) == S1.getIdLey()) && (LT.copias.first().isDisponible())) {
							S1.getUsuario().setLeyPrestada(LT.copias.dequeue());
							S1.getUsuario().getLeyPrestada().setDisponible(false);
							leyes.set(i, LT);
						}
					}
				}
				if(S1.getUsuario().getLeyPrestada() == null) {
					System.out.println("No existen copias disponibles de leyes, espere a que vuelvan a existir copias disponibles");
					solicitudesDeLeyes.enqueue(S1);
				}
				solicitudesDeLeyes.dequeue();
			}
			else {
				System.out.println("Existen mas solicitudes de Ley en la cola, espere a que otros usuarios realizen sus prestamos ");
			}
		}
		else{
			System.out.println("Usted ya posee una copia de ley guardada, devuelvala a la reserva para poder prestar otra copia de ley");
		}
	}
	/**
	 * Prestamo de reglamento por usuario
	 * @param S1 Objeto solicitud de prestamo de reglamento
	 */
	public void prestamoReglamento(SolicitudReglamento S1) {
		Reglamento RT = new Reglamento();
		if(S1.getUsuario().getRegPrestado() == null) {
			if((solicitudesDeReglamentos.first().getIdSolicitud() == S1.getIdSolicitud()) && (solicitudesDeReglamentos.first().getIdReg() == S1.getIdReg())) {
				for(int i = 0; i < reglamentos.size(); i++) {
					RT = reglamentos.get(i);
					if(S1.getUsuario().getRegPrestado() != null) {
						break;
					}
					if(RT.copias.size() != 0) {
						if((Math.floor(RT.copias.first().getId()) == S1.getIdReg()) && (RT.copias.first().isDisponible())) {
							S1.getUsuario().setRegPrestado(RT.copias.dequeue());
							S1.getUsuario().getRegPrestado().setDisponible(false);
							reglamentos.set(i, RT);
						}
					}
				}
				if(S1.getUsuario().getRegPrestado() == null) {
					System.out.println("No existen copias disponibles de reglamentos, espere a que vuelvan a existir copias disponibles");
					solicitudesDeReglamentos.enqueue(S1);
				}
				solicitudesDeReglamentos.dequeue();
			}
			else {
				System.out.println("Existen mas solicitudes de reglamentos en la cola, espere a que otros usuarios realizen sus prestamos ");
			}
		}
		else{
			System.out.println("Usted ya posee una copia de reglamento guardada, devuelvala a la reserva para poder prestar otra copia de reglamento");
		}
	}
	/**
	 * Prestamo de Lote por un usuario
	 * @param S1 Objeto de solicitud de lote por parte del usuario
	 */
	public void prestamoLote(SolicitudLote S1) {
		Ley LT = new Ley();
		Reglamento RT = new Reglamento();
		if(S1.getUsuario().getLeyLote() == null) {
			if((solicitudesDeLote.first().getIdSolicitud() == S1.getIdSolicitud()) && (solicitudesDeLote.first().getIdLey() == S1.getIdLey())) {
				for(int i = 0; i < leyes.size(); i++) {
					LT = leyes.get(i);
					if(S1.getUsuario().getLeyLote() != null) {
						break;
					}
					if(LT.copias.size() != 0) {
						if((Math.floor(LT.copias.first().getIdentificador()) == S1.getIdLey()) && (LT.copias.first().isDisponible())) {
							S1.getUsuario().setLeyLote(LT.copias.dequeue());
							S1.getUsuario().getLeyLote().setDisponible(false);
							leyes.set(i, LT);
						}
					}
				}
				if(S1.getUsuario().getLeyLote() == null) {
					System.out.println("No existen copias disponibles de leyes, espere a que vuelvan a existir copias disponibles");
				}
				int cont = 0;
				for(int f = 0; f < reglamentos.size(); f++) {
					if((S1.getUsuario().reglamentosLote.size() < reglamentos.size()) && (S1.getIdLey() == Math.floor(reglamentos.get(f).getIdLey()))) {
						RT = reglamentos.get(f);
						if((Math.floor(RT.copias.first().getIdLey()) == S1.getIdLey()) && (RT.copias.first().isDisponible())) {
							S1.getUsuario().reglamentosLote.enqueue(RT.copias.dequeue());
							S1.getUsuario().reglamentosLote.first().setDisponible(false);
						}
					}
				}
			}
			else {
				System.out.println("Existen mas solicitudes de Ley por lote en la cola, espere a que otros usuarios realizen sus prestamos ");
			}
		}
		else{
			System.out.println("Usted ya posee una copia de ley por lote guardada, devuelvala a la reserva para poder prestar otra copia de ley por lote");
		}
	}
	/**
	 * Devolucion de ley
	 * @param us Objeto User donde esta almacenada la ley
	 */
	public void devolucionLey(User us) {
		Ley LT = new Ley();
		for(int i = 0; i < leyes.size(); i++) {
			if(us.getLeyPrestada() == null) {
				break;
			}
			LT = leyes.get(i);
			if(LT.getIdentificador() == Math.floor(us.getLeyPrestada().getIdentificador())) {
				LT.copias.enqueue(us.getLeyPrestada());
				us.setLeyPrestada(null);
				leyes.set(i, LT);
			}
		}
	}
	/**
	 * Devolucion de Reglamento
	 * @param us Object User donde esta almacenado el reglamento
	 */
	public void devolucionReglamento(User us) {
		Reglamento LT = new Reglamento();
		for(int i = 0; i < reglamentos.size(); i++) {
			if(us.getRegPrestado() == null) {
				break;
			}
			LT = reglamentos.get(i);
			if(LT.getId() == Math.floor(us.getRegPrestado().getId())) {
				LT.copias.enqueue(us.getRegPrestado());
				us.setRegPrestado(null);
				reglamentos.set(i, LT);
			}
		}
	}
	/**
	 * Devolucion de Lote
	 * @param us Objeto User donde esta almacenado el lote de ley y reglamentos
	 */
	public void devolucionLotes(User us) {
		Ley LT = new Ley();
		Reglamento RT = new Reglamento();
		for(int i = 0; i < leyes.size(); i++) {
			if(us.getLeyLote() == null) {
				break;
			}
			LT = leyes.get(i);
			if(LT.getIdentificador() == Math.floor(us.getLeyLote().getIdentificador())) {
				LT.copias.enqueue(us.getLeyLote());
				us.setLeyPrestada(null);
				leyes.set(i, LT);
			}
		}
		for(int y = 0; y < reglamentos.size(); y++) {
			RT = reglamentos.get(y);
			if(us.reglamentosLote.isEmpty()) {
				break;
			}
			if(RT.getId() == Math.floor(us.reglamentosLote.first().getId())) {
				RT.copias.enqueue(us.reglamentosLote.dequeue());
				reglamentos.set(y, RT);
			}
		}
	}
	/**
	 * Metodo que muestra las las leyes en reserva
	 */
	public void mostrarLeyes() {
		Ley LT = new Ley();
		for(int i = 0; i < leyes.size(); i++) {
			LT = leyes.get(i);
			LT.mostrarCopias();
		}
	}
	/**
	 * Metodo que muestra los reglamentos en reserva
	 */
	public void mostrarReglamentos() {
		Reglamento LT = new Reglamento();
		for(int i = 0; i < reglamentos.size(); i++) {
			LT = reglamentos.get(i);
			LT.mostrarCopias();
		}
	}
</code></pre>
