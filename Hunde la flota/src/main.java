import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		int lado;
		int casillas;
		int numbarcos;
		int random;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el lado del cuadrado que formar� el tablero:");
		
		//Introducir un lado v�lido
		do{
			lado = teclado.nextInt();
			if(lado>10){
				System.out.println("No introduzcas un lado mayor que 10.");
			}else if(lado<=0){
				System.out.println("No introduzcas un n�mero negativo o 0.");
			}
		}while(lado>10 || lado<=0);
		
		casillas = lado*lado;
		String[] tablero = new String [casillas];
		//Casilla-imprimible
		for(int i=0;i<casillas;i++){
			tablero[i] =" * ";
		}
		//N�mero de barcos
		do{
			System.out.println("Introduce el n�mero de casillas que quieres que est�n ocupadas (hay "+casillas+" casillas).");
			numbarcos = teclado.nextInt();
			teclado.nextLine();
		}while(numbarcos>=casillas || numbarcos<=0);
		
		int[] barcos = new int[numbarcos];
		
		for(int i =0;i<numbarcos;i++){
			random = (int)(Math.random()*casillas);
			for(int k=0;k<i;k++){
				
			}
			barcos[i]=random;
			System.out.println(random);
		}
		
		for(int i = 0;i<casillas;i++){
			if(i%lado==0){
				System.out.println();
			}
			System.out.print(tablero[i]);
		}
		
		

	}//fin m�todo main

}
