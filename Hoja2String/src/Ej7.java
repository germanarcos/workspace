import java.util.Scanner;
public class Ej7 {
	public static void ej7(){
		int CONTA_MAX = 5;
		char vocales[]= new char[]{'a','e','i','o','u'};
		int contador[] = new int[CONTA_MAX];
		int max=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = scanner.nextLine();
		String frasetr = frase.toLowerCase();
		for(int i=0;i<5;i++){
			contador[i]=0;
		}
		for(int i = 0;i<frasetr.length();i++){
			if (frasetr.charAt(i)=='a'){
				contador[0]+=1;
			}
			else if (frasetr.charAt(i)=='e'){
				contador[1]+=1;
			}
			else if (frasetr.charAt(i)=='i'){
				contador[2]+=1;
			}
			else if (frasetr.charAt(i)=='o'){
				contador[3]+=1;
			}
			else if (frasetr.charAt(i)=='u'){
				contador[4]+=1;
			}
		}
		for(int i=0;i<5;i++){
			System.out.println("La vocal "+ vocales[i] + " ha salido "+contador[i] + " veces.");
		}
		for(int i = 0;i<5;i++){
			if(contador[i]>=contador[max]){
				max = i;
			}
		}
		System.out.println("La vocal "+ vocales[max] + " ha salido "+contador[max] + " veces y ha sido la que más veces ha salido.");

	}

}
