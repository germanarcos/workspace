import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		boolean filas=true;
		boolean incorrecto;
		int lado;
		int aciertos;
		int intentos;
		String tirada;
		int tiro = 0;
		int casillas;
		int numbarcos;
		int random;
		int tiroFin = 0;
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
		

		do{
			System.out.println("Introduce cuantos intentos quieres");
			intentos=teclado.nextInt();
			if(intentos<numbarcos){
				System.out.println("Pon mas intentos que barcos.");
			}
			if(intentos>=casillas){
				System.out.println("Pon menos intentos que casillas");
			}
		}while (intentos<numbarcos||intentos>=casillas);
		int barcos[] = new int[casillas];

		for(int i=0;i<casillas;i++){
			barcos[i]=0;
		}

		for(int i=0;i<numbarcos;i++){
			do{
				random = (int)(Math.random()*casillas);
			}while (barcos[random]==1);
			barcos[random]=1;
		}

		//Imprimir fila con letra para columna
		System.out.print("  ");
		for(int j=0;j<(lado) && filas==true;j++){
			System.out.print(" "+(char)(65+j)+" ");	
		}
		//Imprimir tablero
		for(int i = 0;i<casillas;i++){

			if(i%lado==0){
				//Imprime numero de columnas
				System.out.printf("%n%2d",((i/lado)+1));
			}
			//Los asteriscos o los "o"
			System.out.print(tablero[i]);

		}

		do{
			incorrecto=false;
			System.out.println("\nEfect�a un lanzamiento (Introduce Fila y Columna juntos.) \nUn ejemplo: A1");
			tirada = teclado.next();
			if(lado<=10&&tirada.length()<=3){
				if(tirada.charAt(0)>=65 && tirada.charAt(0)<(65+lado) ){
					tiro=(int)(tirada.charAt(0)-65);
					tiroFin= tiro + ((Integer.parseInt(tirada.substring(1))-1)*lado);
				}else{
					incorrecto=true;
				}
				//Comprobamos 
			}else{//Si tirada tiene mas de 3 caracteres
				incorrecto=true;
			}
			if(incorrecto==false){
				if(barcos[tiroFin]==1){
					System.out.println("Has acertado!");
					tablero[tiroFin] =" o ";			
				}
				intentos--;
			}else{
				System.out.println("Tirada incorrecta");
			}
			//IMPRIME TABLERO
			System.out.print("  ");
			for(int j=0;j<(lado) && filas==true;j++){
				System.out.print(" "+(char)(65+j)+" ");	
			}
			//Imprimir tablero
			for(int i = 0;i<casillas;i++){

				if(i%lado==0){
					//Imprime numero de columnas
					System.out.printf("%n%2d",((i/lado)+1));
				}
				//Los asteriscos o los "o"
				System.out.print(tablero[i]);

			}
			aciertos=0;
			for(int i=0;i<casillas;i++){
				if(tablero[i].equals(" o ")){
					aciertos++;
				}
			}
			if(aciertos>0 && aciertos!=numbarcos){
				System.out.println("\nHas acertado " + aciertos);
				if(aciertos==1){
					System.out.print(" vez");
				}else{
					System.out.print(" veces");
				}
			}
			
			
			if(aciertos==numbarcos){
				System.out.println("\n�HAS GANADO!");
				intentos=0;
			}
		}while(intentos>0);


	}//fin m�todo main

}
