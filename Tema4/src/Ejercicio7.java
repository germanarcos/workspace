import java.util.Scanner;
public class Ejercicio7 {
	public static void ejercicio7(){
		String frase;
		int contmay = 0;
		int contmin = 0;
		int contnum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una frase");
		frase = scanner.nextLine();
		for(int i =0;i<frase.length();i++){
			if(frase.charAt(i)>=65 && frase.charAt(i)<=90){
				contmay +=1;
			}
			else if(frase.charAt(i)>=97 && frase.charAt(i)<=122){
				contmin +=1;
			}
			else if(frase.charAt(i)>=48 && frase.charAt(i)<=57){
				contnum+=1;
			}
		}
		System.out.println("El número de carácteres mayúsculas es: "+contmay);
		System.out.println("El número de carácteres minúsculas es: "+contmin);
		System.out.println("El número de carácteres numéricos es: "+contnum);
	}

}
