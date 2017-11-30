import java.util.Scanner;

public class Ej2 {
	public static void ej2(){
		final int RANGO_NUMEROS = 90;
		boolean encontrado;
		int MAX_FILAS = 3;
		int MAX_COLUMNAS=5;
		int num;
		int salir;
		int[][] carton = new int[MAX_FILAS][MAX_COLUMNAS];
		int[][] aciertos = new int[MAX_FILAS][MAX_COLUMNAS];
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[RANGO_NUMEROS];
		for(int i = 0;i<RANGO_NUMEROS;i++){
			numeros[i] = 0;
		}
		//Generando el carton
		for(int filas=0;filas<MAX_FILAS;filas++){
			for(int col=0;col<MAX_COLUMNAS;col++){
				do{
					num = Random.random(90, 1);
				}while(numeros[(num-1)]==1);
				numeros[(num-1)]=1;
				carton[filas][col]=num;
			}
		}//Cart�n generado

		//Mostrar carton
		System.out.println("Su cart�n:");
		for(int filas=0;filas<MAX_FILAS;filas++){
			for(int col=0;col<MAX_COLUMNAS;col++){
				System.out.printf("%5d",carton[filas][col]);
			}
			System.out.println();
		}
		//Resetear numeros para evitar repeticiones al sacar bolas
		for(int i = 0;i<RANGO_NUMEROS;i++){
			numeros[i] = 0;
		}
		//Sacar bolas
		for(salir=1; salir<RANGO_NUMEROS+1;salir++){
			encontrado=false;
			do{
				num = Random.random(90, 1);
			}while(numeros[(num-1)]==1);
			numeros[(num-1)]=1;
			System.out.println("Ha salido el n�mero "+num+".");
			for(int filas=0;filas<MAX_FILAS&&encontrado==false;filas++){
				for(int col=0;col<MAX_COLUMNAS&&encontrado==false;col++){
					if(num==carton[filas][col]){
						System.out.println("Tienes ese numero!");
						numeros[num-1]=1;
						encontrado = true;
					}
				}
			}
			encontrado = true;
			for(int filas=0;filas<MAX_FILAS&&encontrado==true;filas++){	
				for(int col=0;col<MAX_COLUMNAS&&encontrado==true;col++){
					if(numeros[(carton[filas][col])-1]==1){
						if(col==MAX_COLUMNAS-1){
							System.out.println("LINEA "+filas);
						}
					}
					else{
						encontrado = false;
					}
					
				}encontrado = true;
			}
			System.out.println("Se han sacado "+salir+" bolas");
		}

	}
}
