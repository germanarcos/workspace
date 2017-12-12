import java.util.Scanner;
public class Ejercicio2 {
/* Introducir una cadena por teclado y devolver una cadena
 * en la que todos los car�cteres est�n duplicados
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String entrada = teclado.nextLine();
		String cadenaGenerada="";
		/*
		 * Creamos una nueva cadena en la que almacenaremos la cadena con los car�cteres duplicados.
		 * De esta forma almacenaremos en memoria la nueva cadena y la mostraremos por pantalla
		 */
		for (int posicion = 0;posicion<entrada.length();posicion++){
			//Sumamos dos veces el car�cter en cada posici�n a la nueva cadena
			cadenaGenerada += entrada.charAt(posicion);
			cadenaGenerada += entrada.charAt(posicion);
		}
		System.out.println(cadenaGenerada);
		teclado.close();
	}

}
