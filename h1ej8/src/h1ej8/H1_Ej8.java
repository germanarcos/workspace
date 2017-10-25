package h1ej8;
import java.math.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class H1_Ej8 {
	public static void main(String[] args) throws InterruptedException {
		Scanner keyboard = new Scanner(System.in);
		double amount;
		double discount = 15;
		String month;
		
			
			System.out.println("Introduce el importe");
			amount = keyboard.nextDouble();
			
			System.out.println("Introduce el mes");
			month = keyboard.next();
			
			
				if (month.equalsIgnoreCase("Octubre") && amount > 0) {
					amount = amount * (1-(discount/100));
					BigDecimal cantidad = new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP);
					
					System.out.println("Como estamos a " + month);
					
					TimeUnit.SECONDS.sleep(2);
					System.out.println("Le aplicaremos un descuento del " + discount + "%");

						TimeUnit.SECONDS.sleep(2);
						System.out.println("Nuevo importe: " + cantidad);
				} else {
					System.out.println("No se puede aplicar el descuento");
				}
	}
}

/* TEMPORAL !!!!!
	Float importe
	Float descuento
	String mes


	Enviar "Introduce el importe"
	Introduce importe

	Enviar "Introduce el mes"
	Introduce mes


	Si mes es igual a "octubre" es mayor que 0
		descuento = 15

		importe = importe - (descuento / importe) * 100
			Enviar "Como estamos a " + mes
			Esperar 1 segundos
			Enviar "Le aplicaremos un descuento del" + descuento + "%"
			Esperar 1 segundos
			Enviar "Nuevo importe: " + importe

	Si no
		Enviar "No se puede aplicar el descuento"
 */
