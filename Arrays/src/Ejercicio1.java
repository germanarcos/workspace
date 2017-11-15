import java.util.Scanner;
public class Ejercicio1 {
	public static void ejercicio1(){
		Scanner teclado = new Scanner(System.in);
		int LENGTH = 3;
		String[] frases = new String[]{" es superior a la media.", " es inferior a la media", " es igual a la media"};
		int[] contadores = new int[LENGTH];
		double media = 0;
		int max = 10;
		int min = -10;
		int NUMEROS_LENGTH=20;
		int[]numeros = new int[NUMEROS_LENGTH];
		for (int i = 0;i<LENGTH;i++){
			contadores[i] = 0;
		}
		for(int i=0;i<NUMEROS_LENGTH;i++){
			numeros[i] = Random.random(10, -10);
		}
		for(int i=0;i<NUMEROS_LENGTH;i++){
			media += numeros[i];
		}
		media /= NUMEROS_LENGTH;
		System.out.println("La media es: "+media +"\n");
		for(int i = 0; i<NUMEROS_LENGTH;i++){
			if(numeros[i]>(int)media){
				System.out.println("El número "+numeros[i]+ frases[0]);
				contadores[0] +=1;
			}
			else if(numeros[i]<(int)media){
				System.out.println("El número "+numeros[i]+ frases[1]);
				contadores[1] +=1;
			}
			else if(numeros[i]==(int)media){
				System.out.println("El número "+numeros[i]+ frases[2]);
				contadores[2] +=1;
			}
			System.out.println();
		}
		System.out.println("Hay "+contadores[0]+" números superiores a la media");
		System.out.println("Hay "+contadores[1]+" números inferiores a la media");
		System.out.println("Hay "+contadores[2]+" números iguales a la media");
	}

}
