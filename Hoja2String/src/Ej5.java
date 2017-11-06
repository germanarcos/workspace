import java.util.Scanner;
public class Ej5 {
	public static void ej5(){
		Scanner scanner = new Scanner(System.in);
		String palabra;
		do{
		System.out.println("Introduce una palabra");
		palabra = scanner.next();
		}while(palabra.length()<2);
		palabra =  palabra.charAt(palabra.length()-1) + palabra.substring(1, palabra.length()-1) +
				palabra.charAt(0);
		System.out.println(palabra);
	}

}
