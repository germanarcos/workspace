import java.util.Scanner;

public class Ejercicio2Substrings {
	/* Introducir una cadena por teclado y devolver una cadena
	 * en la que todos los carácteres estén duplicados
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String entrada = teclado.nextLine();

		String cadenaGenerada="";
		/*
		 * Creamos una nueva cadena en la que almacenaremos la cadena con los carácteres duplicados.
		 * De esta forma almacenaremos en memoria la nueva cadena y la mostraremos por pantalla
		 */
		for (int posicion = 0;posicion<entrada.length();posicion++){
			//Utilizamos el metodo concat para añadir a la nueva cadena los carácteres en cada posición
			cadenaGenerada = cadenaGenerada.concat(entrada.substring(posicion, posicion+1)).concat(entrada.substring(posicion, posicion+1));
		}
		System.out.println(cadenaGenerada);
		teclado.close();

	}

}
