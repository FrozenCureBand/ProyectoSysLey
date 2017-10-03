package Proyecto;
/**
 * 
 * @author Will
 * @version 1.0
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * Este codigo funciona con un manejo de los objetos de leyes en una lista
		 * esto me causo conflicto porque en las instrucciones dice que al devolverse una ley esta debe ser la 
		 * ultima a ser prestada en siguientes ocaciones(el funcionamiento de un pila) pero si manejaba las leyes
		 * con una pila los usuarios no podian determinar que ley deseaban, siempre iban a obtener la ley que se 
		 * hubiera agregado de ultimo.
		 * Te digo esto para saber que penses en eso y decidamos como hacerle porque yo estoy perdido en eso
		 */
		Scanner sc = new Scanner(System.in);
		ArregloList<Ley> leyes = new ArregloList<>(100);
		leyes.add(0, new Ley("Proteccion infantil", 1476));
		leyes.add(1, new Ley("Proteccion Ambiental", 1634));
		Ley L1 = leyes.get(0);
		Ley L2 = leyes.get(1);
		L2.crearCopias(leyes.get(1).getNombre());
		L1.crearCopias(leyes.get(0).getNombre());
		/**
		System.out.println((int)L1.getIdentificador());
		System.out.println(L1.copias[0].getIdentificador());
		System.out.println(L1.copias[1].getIdentificador());
		System.out.println(L1.copias[2].getIdentificador());
		System.out.println(L1.copias[3].getIdentificador());
		System.out.println(L1.copias[4].getIdentificador());
		System.out.println(L1.getNombre());
		System.out.println(L1.copias[0].getNombre());
		System.out.println(L1.copias[1].getNombre());
		System.out.println(L1.copias[2].getNombre());
		System.out.println(L1.copias[3].getNombre());
		System.out.println(L1.copias[4].getNombre());
		*/
		//Con este codigo el usuario ingresa el identificador para prestar el objeto de Ley que desea y elimina el objeto de la lista 
		System.out.println("Ingrese el identificador de ley para prestamo");
		double id = sc.nextDouble();
		Ley LReturn = new Ley();
		for(int i = 0; i < leyes.size(); i++) {
			L1 = leyes.get(i);
			for(int f = 0; f < 5; f++) {
				if(L1.copias[f].getIdentificador() == id) {
					LReturn = L1.copias[f];
					L1.copias[f] = null;
				}
			}
		}
		/**Para el almacenamiento de las leyes prestadas pense que talvez cada ususario y grupo de ellos
		*  podia tener una cola o lista donde almacenara las leyes prestadas y para cuando quisiera devolverla
		*  solo ingresara el identificador de la ley que desea que regrese a la lista general de leyes
		*/
		System.out.println("La ley solicitada es la siguiente:");
		System.out.println(LReturn.toString());
		
		//Este codigo muestra todas las leyes disponibles
		System.out.println("Las leyes aun disponibles son: ");
		for(int i = 0; i < leyes.size(); i++) {
			L1 = leyes.get(i);
			L1.mostrarCopias();
		}
		
		//Codigo para la devolucion de leyes a la lista general
		//Aqui deberia haber un codigo para la busqueda de la ley en la cola o lista del usuario
		for(int i = 0; i < leyes.size(); i++) {
			L1 = leyes.get(i);
			if(L1.getIdentificador() == Math.floor(LReturn.getIdentificador())) {
				for(int f = 0; f < 5; f++) {
					if(L1.copias[f] == null) {
						L1.copias[f] = LReturn;
						System.out.println("La ley fue devuelta exitosamente");
					}
				}
			}
		}
		System.out.println("Las leyes aun disponibles son: ");
		for(int i = 0; i < leyes.size(); i++) {
			L1 = leyes.get(i);
			L1.mostrarCopias();
		}
	}

}
