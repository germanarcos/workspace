import java.util.Scanner;
public class Ejercicio10 {

	public static void ejercicio10(){
		Scanner scanner = new Scanner(System.in);
		String frase;
		String frasem;
		int[] letras = new int[26];
		System.out.println("Introduce una frase");
		frase = scanner.nextLine();
		frasem = frase.toUpperCase();
		for(int i = 0; i<frasem.length();i++){
			if(frasem.charAt(i)>=65 && frasem.charAt(i)<=90){
				letras[(frasem.charAt(i)-65)] += 1;
			}
		}
		for(int j = 0; j<=25;j++){
			if(letras[j]>0){
				System.out.println("La letra "+ (char)(65+j)+ " ha aparecido " + letras[j]+ " veces");
			}
		}
	}//fin metodo
}
