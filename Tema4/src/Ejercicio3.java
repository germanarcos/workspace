import java.util.Scanner;
public class Ejercicio3 {

	public static void ejercicio3(){		
		String frase;
		String palabra;
		String frase2;
		int pos = 0;
		int cont = 1;
		int num = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba una frase");
		frase = teclado.nextLine();
		System.out.println("Escriba la plabra a buscar");
		palabra = teclado.nextLine();

		if (frase.indexOf(palabra) > -1){ /*Buscamos la palabra indicada por la frase*/
			pos = frase.indexOf(palabra); 
			System.out.println(cont+"La posicion de la palabra " +palabra+ " es " +pos);
			while (pos > -1){ /*Mientras no encuentre la palabra*/
				pos = pos+1;
				pos = frase.indexOf(palabra,pos);
				if(pos>-1){ /*Cuando no la encuentra finaliza el bucle*/
					cont = cont + 1;
					System.out.println(cont+"La posicion de la palabra " +palabra+ " es " +pos);
				}
			}
		}else{
			System.out.println("La palabra no esta en la frase.");
		}
	}
}
