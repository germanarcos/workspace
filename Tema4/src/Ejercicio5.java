import java.util.Scanner;
public class Ejercicio5 {

	public static void ejercicio5(){
		String frase;
		int MAX_CAR = 80;
		Scanner scanner = new Scanner(System.in);
		String frasepar = "";
		String fraseim = "";
		do{
		System.out.println("Introduce una frase de menos de 80 caracteres");
		frase = scanner.nextLine();
		}while(frase.length()>MAX_CAR);
		for(int i = 0;i<frase.length();i++){
			if(i%2==0){
				frasepar = frasepar + frase.charAt(i);
			}
			else {
				fraseim = fraseim + frase.charAt(i);
			}
		}
		System.out.println(frasepar);
		System.out.println(fraseim);
	}
}
