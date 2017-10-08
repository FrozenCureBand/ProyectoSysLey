package Proyecto_v2;

import java.util.Scanner;

public class Main2 {

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
	public void crearLey(String nombre, int id) {
		Ley L1 = new Ley(nombre, id);
		L1.crearCopias();
		leyes.add(contL, L1);
		contL++;
		
	}
	public void crearReglamento(String nombre, int id, int idLey) {
		Reglamento R1 = new Reglamento(nombre, id, idLey);
		R1.crearCopias();
		reglamentos.add(contR, R1);
		contR++;
	}
	public void crearSolicitudLey(int id, User us, int idS) {
		SolicitudLey s1 = new SolicitudLey(id, us, idS);
		solicitudesDeLeyes.enqueue(s1);
	}
	public void crearSolicitudReglamento(int id, User us, int idS) {
		SolicitudReglamento s1 = new SolicitudReglamento(id, us, idS);
		solicitudesDeReglamentos.enqueue(s1);
	}
	public void crearSolicitudLote(int id, User us, int idS) {
		SolicitudLote s1 = new SolicitudLote(id, us, idS);
		solicitudesDeLote.enqueue(s1);
	}
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
	public void mostrarLeyes() {
		Ley LT = new Ley();
		for(int i = 0; i < leyes.size(); i++) {
			LT = leyes.get(i);
			LT.mostrarCopias();
		}
	}
	public void mostrarReglamentos() {
		Reglamento LT = new Reglamento();
		for(int i = 0; i < reglamentos.size(); i++) {
			LT = reglamentos.get(i);
			LT.mostrarCopias();
		}
	}
	

}
