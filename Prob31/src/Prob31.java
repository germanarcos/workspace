import java.util.Scanner;
public class Prob31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String decision;
		int m;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		m = scanner.nextInt();
		System.out.println("Introduce otro n�mero");
		n = scanner.nextInt();
		System.out.println("Elige que operaci�n realizar con estos dos n�meros: ");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicaci�n");
		System.out.println("4) Divisi�n");
		decision = scanner.next();
		if(decision.equals("1") || decision.equals("Suma")){
			Suma.Suma(m,n);
		}
		if(decision.equals("2") || decision.equals("Resta")){
			Resta.Resta(m, n);
		}
		if(decision.equals("3") || decision.equals("Multiplicacion")){
			multiplicacion.multiplicacion(m, n);
		}
		if (decision.equals("4") || decision.equals("Division")){
			Divisi�n.Division(m, n);
		}
	}

}
