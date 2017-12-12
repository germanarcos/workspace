
public class Ej1 {

	public static void main(String[] args) {
		/*Generar respuestas de forma aleatoria para 5 alumnos, ninguna respuesta dejada en blanco
		 * Formatear la salida, calcular la nota comparando con la plantilla
		 */
		int[] plantilla = new int[]{1,3,0,2,1,2,0,2,1,3};
		final int MAX_ALUMNOS =5;
		final int NUM_RESPUESTAS = 10;
		int[] aciertos = new int[MAX_ALUMNOS];
		int[] errores = new int[MAX_ALUMNOS];
		double[] calificaciones = new double[MAX_ALUMNOS];
		//Vector que almacenara para cada alumno que respuesta ha seleccionado
		int[][] alumno = new int [MAX_ALUMNOS][NUM_RESPUESTAS];
		//Ponemos a cero los vectores de aciertos y errores
		for(int alu = 0;alu<MAX_ALUMNOS;alu++){
			aciertos[alu]=0;
			errores[alu]=0;
		}
		
		//Generamos las respuestas
		for(int alu=0;alu<MAX_ALUMNOS;alu++){
			for (int respuesta=0;respuesta<NUM_RESPUESTAS;respuesta++){
				alumno[alu][respuesta]= (int)(Math.random()*4);
				if(alumno[alu][respuesta]==plantilla[respuesta]){
					aciertos[alu]+=1;
				}//fin if
				else{
					errores[alu]+=1;
				}//fin else
			}//for respuestas
			//Una vez generadas todas las respuestas del alumno, calculamos su nota
			calificaciones[alu] = (aciertos[alu])-(errores[alu]*0.3);
		}//for alumnos
		//Plantilla respuestas
		System.out.print("Solución:\t");
		for(int resp=0;resp<NUM_RESPUESTAS;resp++){
			/*
			 * Como almacenamos enteros, habrá que castearlos a int para imprimirlo por pantalla
			 * Sumamos 65 a cada valor, ya que 65 es el código ASCII de la A mayúscula, así tendremos A, B, C y D
			 */
			System.out.printf("%2c ",(char)(65+plantilla[resp]));
		}
		System.out.println("\t\tAciertos \tFallos \t\tCalificación\n");
		//Formateo salida alumnos
		for(int alu=0;alu<MAX_ALUMNOS;alu++){
			System.out.print("Alumno "+ (alu+1)+"\t");
			for(int resp=0;resp<NUM_RESPUESTAS;resp++){
				System.out.printf("%2c ",(char)(65+alumno[alu][resp]));
			}
			System.out.print("\t\t"+aciertos[alu]+"\t\t"+errores[alu]+"\t\t");
			//Cálculo de la nota del alumno y impresión
			System.out.printf("%3f",calificaciones[alu]);
			System.out.println();
		}

		

	}
}
