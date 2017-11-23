import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		boolean filas=true;
		int lado;
		int intentos = 3;
		String tirada;
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

		int[] barcos = new int[casillas];

		for(int i=0;i<casillas;i++){
			barcos[i]=0;
		}

		for(int i=0;i<numbarcos;i++){
			do{
				random = (int)(Math.random()*casillas);
			}while (barcos[random]==1);
			barcos[random]=1;
		}

		//Imprimir tablero perfe
		//Imprimir fila con letra para columna
		System.out.print("  ");
		for(int j=0;j<(lado) && filas==true;j++){
			System.out.print(" "+(char)(65+j)+" ");	
		}
		//Imprimir tablero
		for(int i = 0;i<casillas;i++){

			if(i%lado==0){
				//Imprime numero de columnas
				System.out.printf("%n%2d",((i/10)+1));
			}
			//Los asteriscos o los "o"
			System.out.print(tablero[i]);

		}

		do{
			System.out.println("\nEfect�a un lanzamiento (Introduce Fila y Columna juntos.) \nUn ejemplo: A1");
			intentos--;
		}while(intentos>0);


	}//fin m�todo main

}
