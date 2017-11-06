import java.util.Scanner;
public class Ej1 {

	public static void ej1(){
		char letra;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = scanner.nextLine();
		do{
			System.out.println("Introduce una letra");
			letra = scanner.next().charAt(0);
		}while(letra<=97 && letra>=122);
		for(int i = 0;i<frase.length();i++){
			if(frase.charAt(i)==letra){
				System.out.print((char)(letra-32));
			}
			else{
				System.out.print(frase.charAt(i));
			}
		}

	}
}
