import java.util.Scanner;
public class Ejercicio4 {

	public static void ejercicio4(){
		Scanner scanner = new Scanner(System.in);
		String frase;
		int decision;
		int MAX_CHAR = 80;
		System.out.println("Introduce una frase: ");
		frase = scanner.nextLine();
		while(frase.length()>MAX_CHAR){
			System.out.println("Introduce una frase de menos de 80 car�cteres");
			frase = scanner.nextLine();
		}
		do{		
			System.out.println("Introduce 1 si quieres pasar la frase a may�sculas,"
					+ "\n 2 si quieres pasar la frase a min�sculas."
					+ "\n0 para salir.");
			decision = scanner.nextInt();
		}while(decision!=1 && decision!=2 && decision != 0);
		
		switch(decision){
		case 1:
			System.out.println(frase.toUpperCase());
			break;
		case 2:
			System.out.println(frase.toLowerCase());
			break;
		case 0:
			System.out.println("Saliendo");
			break;
		}
	}
}
