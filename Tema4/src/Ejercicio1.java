import java.util.Scanner;

public class Ejercicio1 {
	public static void ejercicio1(){
		Scanner scanner = new Scanner(System.in);
		String frase;
		int MAX_LONGITUD = 80;
		System.out.println("Introduce una frase");
		frase = scanner.nextLine();
		while(frase.length()>MAX_LONGITUD){
			System.out.println("La frase tiene m�s de "+MAX_LONGITUD+ " caracteres, introduce una frase con menos de 80.");
			frase = scanner.nextLine();
		}
		for (int lineas = 0; lineas < frase.length();lineas++){
			System.out.println(frase.substring(0, 1+lineas));
		}
	}
}
