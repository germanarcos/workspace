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
		int x=4, y=5;
		int[][] matriz = new int[x][y];
		for(int i = 0;i<x;i++){
			for(int k = 0;k<y;k++){
				matriz[i][k] = (int)Math.floor(Math.random()*100 );
			}
		}
		System.out.println("Matriz normal:");
		for(int i = 0;i<x;i++){
			for(int k = 0;k<y;k++){
				System.out.printf("%5d",matriz[i][k]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Matriz traspuesta: ");
		for(int k = 0;k<y;k++){
			for(int i = 0;i<x;i++){
				System.out.printf("%5d",matriz[i][k]);
			}
			System.out.println("");
		}


	}//ej37
	public static void ej38(){
		int cursos;
		int alumnos;
		System.out.println("Introduce el n�mero de cursos");
		cursos = teclado.nextInt();
		System.out.println("Introduce el n�mero de alumnos por curso");
		alumnos = teclado.nextInt();
		float[][] notas = new float[cursos][alumnos];
		for(int i = 0;i<cursos;i++){
			for(int k = 0;k<alumnos;k++){
				notas[i][k] = (float)Math.random()*10 ;
			}
		}
		for(int i = 0;i<cursos;i++){
			System.out.println("Curso "+(i+1)+ ": ");
			System.out.print("Notas:");
			for(int j = 0; j<alumnos;j++){
				System.out.printf("%10.2f",notas[i][j]);

			}
			System.out.println("");
		}

	}//ej38
	public static void ej40(){
		int PAG=3, FIL=4, COL=5;
		int[][][] matriz = new int[PAG][FIL][COL];
		for(int i = 0;i<PAG;i++){
			for(int j = 0;j<FIL;j++){
				for(int k = 0;k<COL;k++){
					matriz[i][j][k] = i*20 + j*5 + k + 1;
				}
			}
		}
		for(int i = 0;i<PAG;i++){
			System.out.println("P�gina "+ (i+1)+"\n");
			for(int j = 0;j<FIL;j++){
				System.out.println("Fila " +(j+1));
				for(int k = 0;k<COL;k++){
					System.out.printf("%5d",matriz[i][j][k]);
				}
				System.out.println();
			}
		}

	}//ej40
	public static void ej41(){
		int CENTRO = 5, CURSO = 10, ALUMNOS = 20;
		float[][] media = new float[CENTRO][CURSO];
		float[][][] notas = new float[CENTRO][CURSO][ALUMNOS];
		for(int i = 0;i<CENTRO;i++){
			for(int j = 0; j<CURSO;j++){
				for(int k = 0; k<ALUMNOS; k++){
					notas[i][j][k] = (float)Math.random()*10;
					notas[i][j][k] = notas[i][j][k];
				}
			}
		}//Introducir las notas
		for(int i = 0;i<CENTRO;i++){
			for(int j = 0; j<CURSO;j++){
				for(int k = 0; k<ALUMNOS; k++){
					media[i][j] += notas[i][j][k];
				}
				media[i][j] = media[i][j]/ALUMNOS;
			}
		}//Calculo nota media

		for(int i=0,max=0;i<CURSO;i++){
			for(int j=0;j<CENTRO;j++){
				if(media[j][i]>=media[max][i]){
					max = j;
				}
			}
			System.out.printf("La nota media m�s alta del curso " + (i+1) +" es: "+"%2.2f y pertenece al centro %1d %n",media[max][i],(max+1));
		}



	}//ej41
	public static void ej42(){
		int  REPR = 3, MES=12, PROD = 4;
		int[][][] ventas = new int[REPR][MES][PROD];
		int[][] total = new int[MES][PROD];
		for(int i = 0;i<REPR;i++){
			for(int j=0;j<MES;j++){
				for(int k=0;k<PROD;k++){
					ventas[i][j][k] = (int)Math.floor(Math.random()*50);
				}
			}
		}//Fin de asignacion de ventas
		System.out.println("Ventas por representante");
		for(int i = 0;i<REPR;i++){
			System.out.println("Representante "+(i+1)+"\n");
			for(int j=0;j<MES;j++){
				Meses.mostrar(j);
				for(int k=0;k<PROD;k++){
					System.out.printf("%8d", ventas[i][j][k]);
				}
				System.out.println("\n");
				if(j==11)
					System.out.println();
			}
		}//fin de impresion de ventas por representante

		//Calculo de ventas totales

		for(int j=0;j<MES;j++){
			for(int k=0;k<PROD;k++){
				total[j][k]=0;
				for(int i =0;i<REPR;i++){
					total[j][k] += ventas[i][j][k]; 
				}
			}
		}
		System.out.println("Ventas totales:\n");

		//Impresion de ventas totales
		for(int i =0;i<MES;i++){
			Meses.mostrar(i);
			for(int j=0;j<PROD;j++){
				System.out.printf("%8d",total[i][j]);
			}
			System.out.println("\n");
		}
	}//ej42
}
