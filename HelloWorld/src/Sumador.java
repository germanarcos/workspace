import java.util.Scanner;

public class Sumador {
	static Scanner scanner = new Scanner(System.in);
	
	public static void sumador(){
		int a;
		int b;
		int temp = 0;
		System.out.println("Introduce un n�mero");
		a = scanner.nextInt();
		System.out.println("Introduce otro n�mero");
		b = scanner.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("El valor de a es: "+a);
		System.out.println("El valor de b es: "+b);
		
		
		
	}
}
