import java.util.Scanner;
public class Ejercicio3 {
	public static void ejercicio3(){
		int LENGTH = 20;
		int[] vector = new int[LENGTH];
		int max=0,min=0;
		for(int i = 0;i<LENGTH;i++){
			vector[i] = (int)(Math.random()*51);
			if(vector[i]>vector[max]){
				max = i;
			}else if(vector[i]<vector[min]){
				min = i;
			}
		}
		for(int i=0;i<LENGTH;i++){
			System.out.println(vector[i]);
		}
		System.out.println("El m�nimo "+vector[min]+" se encuentra en la posici�n "+(min+1));
		System.out.println("El m�ximo "+vector[max]+" se encuentra en la posici�n "+(max+1));
	}
}
