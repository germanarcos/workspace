import java.math.*;
import java.util.Scanner;
public class Ej13 {

	public static void ej13(){
		String seguir = "1";
		while (!seguir.contains("0") && !seguir.contains("salir")){
			double x1;
			double x2;
			double b;
			double a;
			double c;

			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduce un n�mero a");
			a = scanner.nextDouble();
			System.out.println("Introduce un n�mero b");
			b = scanner.nextDouble();
			System.out.println("Introduce un n�mero c");
			c = scanner.nextDouble();
			if((b*b -(4*a*c))<0){
				System.out.println("No hay soluci�n");
			}
			x1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
			x2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
			System.out.println(x1);
			System.out.println(x2);
			System.out.println("�Quieres introducir otra ecuacion? Introduce 0 para salir.");
			seguir = scanner.next();
		}
	}
}
