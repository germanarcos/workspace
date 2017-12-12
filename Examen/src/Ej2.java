import java.util.Scanner;
public class Ej2 {
	/* Introducir una cadena por teclado y devolver una cadena
	 * en la que todos los carácteres estén duplicados
	 */

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String entrada;
		System.out.println("Introduce una cadena");
		entrada = teclado.nextLine();
		//De esta forma solo se imprime la cadena que generamos, pero no se guarda en memoria.
		for(int posicion = 0; posicion<entrada.length();posicion++){
			System.out.print(entrada.charAt(posicion));
			System.out.print(entrada.charAt(posicion));
		}
		teclado.close();
	}
}
