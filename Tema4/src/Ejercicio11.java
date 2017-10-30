import java.util.Scanner;
public class Ejercicio11 {

	public static void ejercicio11(){
		String palabra;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("Introduce una frase de menos de 20 caracteres");
			palabra = scanner.nextLine();
		}while(palabra.length()>20);
		for(int i = 0; i<palabra.length();i++){// n rotaciones distintas
			for(int j=0; j<palabra.length(); j++){//imprime todas las letras en el orden que toque
				System.out.print((char)palabra.charAt(((palabra.length()*2)-i+j)%palabra.length()));
			}
			System.out.print("\n");
		}

	}
}
/*
	--USANDO CHAR ARRAY
import java.util.Scanner;
public class Ejercicio11 {

	public static void ejercicio11(){
		String palabra;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("Introduce una frase de menos de 20 caracteres");
			palabra = scanner.nextLine();
		}while(palabra.length()>20);
		char[] letras = new char [palabra.length()];
		letras = palabra.toCharArray();
		for(int i = 0; i<palabra.length();i++){// n rotaciones distintas
			for(int j=0; j<palabra.length(); j++){//imprime todas las letras en el orden que toque
			System.out.print(letras[((palabra.length()*2)-i+j)%palabra.length()]);
			}
			System.out.print("\n");
		}
		
	}
}
*/