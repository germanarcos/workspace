import java.util.Scanner;
public class Ej2Substrings {
	/* Introducir una cadena por teclado y devolver una cadena
	 * en la que todos los carácteres estén duplicados
	 */

	public static void main(String[] args) {
		String entrada;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		entrada = teclado.nextLine();
		//Imprime caracter por caracter usando substrings, pero no guarda el resultado en memoria
		for(int posicion = 0; posicion< entrada.length();posicion++){
			System.out.print(entrada.substring(posicion, posicion+1));
			System.out.print(entrada.substring(posicion, posicion+1));
		}
		teclado.close();
	}

}
