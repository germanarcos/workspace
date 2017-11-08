import java.util.Scanner;
public class pulsacion {
	static Scanner teclado = new Scanner(System.in);		
	char pulsacion;

	public void pulsa(){
		pulsacion = teclado.next().charAt(0);

	}
	public char comprueba(){
		return pulsacion;
	}

}
