import java.util.Scanner;
public class Ejercicio2 {

	public static void ejercicio2(){
		int LENGTH = 10;
		int[] vec1 = new int[LENGTH];
		int[] vec2 = new int[LENGTH];
		int[] vecsuma=new int[LENGTH];


		for(int i = 0; i<LENGTH;i++){
			vec1[i] = (int)(Math.random()*101);
			vec2[i] = (int)(Math.random()*101);
			vecsuma[i] = vec1[i]+vec2[i];
			System.out.printf("%6d %6d %6d %n",vec1[i],vec2[i],vecsuma[i]);
		}


	}
}
