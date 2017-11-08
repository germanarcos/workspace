import java.util.Scanner;
public class Ejercicios {
	static Scanner teclado = new Scanner(System.in);
	public static void ej33(){
		int MAX_LENGTH = 20;
		String[] personas = new String[MAX_LENGTH];
		for(int i=0;i<MAX_LENGTH;i++){
			System.out.println("Introduce el nombre de una persona");
			personas[i]= teclado.nextLine();
		}
		for(int i=0;i<MAX_LENGTH;i++){
			System.out.println(personas[i]);
		}

	}//ej33
	public static void ej34(){
		int ASIGNATURAS = 10;
		float media = 0;
		float[] notas = new float[ASIGNATURAS];
		for(int i= 0; i<ASIGNATURAS;i++){
			System.out.println("Introduce la nota de una asignatura");
			do{
				notas[i]=teclado.nextFloat();
				if(notas[i]<0 || notas[i]>10){
					System.out.println("Introduce una nota entre 0 y 10");
				}
			}while(notas[i]<0 || notas[i]>10);
			media+=notas[i];
		}
		media = media/ASIGNATURAS;
		System.out.printf("La media del alumno es: " + "%2.2f", media);

	}//ej34
	public static void ej35(){
		int ASIGNATURAS = 10;
		boolean encontrada = false;
		int notabuscada;
		float media = 0;
		float[] notas = new float[ASIGNATURAS];
		for(int i= 0; i<ASIGNATURAS;i++){
			System.out.println("Introduce la nota de una asignatura");
			do{
				notas[i]=teclado.nextFloat();
				if(notas[i]<0 || notas[i]>10){
					System.out.println("Introduce una nota entre 0 y 10");
				}
			}while(notas[i]<0 || notas[i]>10);
			media+=notas[i];
		}
		media = media/ASIGNATURAS;
		System.out.printf("La media del alumno es: " + "%2.2f", media);
		
		System.out.println("Introduce la nota que quieres buscar");
		notabuscada = teclado.nextInt();
		for(int i=0;i<ASIGNATURAS && encontrada == false;i++){
			if((int)notas[i]==notabuscada){
				System.out.println("La nota "+notabuscada+" esta en la posicion " +i);
				encontrada = true;
			}
		}if(encontrada==false){
			System.out.println("La nota "+notabuscada+" no se encuentra en las notas del alumno.");
		}
		


	}//ej35
	public static void ej36(){
		int x=4, y=5;
		int[][] matriz = new int[x][y];
		for(int i = 0;i<x;i++){
			for(int k = 0;k<y;k++){
				matriz[i][k] = (int)Math.floor(Math.random()*100 );
			}
		}
		for(int i = 0;i<x;i++){
			for(int k = 0;k<y;k++){
				System.out.printf("%5d",matriz[i][k]);
			}
			System.out.println("");
		}

	}//ej36
	public static void ej37(){

	}//ej37
	public static void ej38(){

	}//ej38
	public static void ej39(){

	}//ej39
	public static void ej40(){

	}//ej40
	public static void ej41(){

	}//ej41
	public static void ej42(){

	}//ej42
}
