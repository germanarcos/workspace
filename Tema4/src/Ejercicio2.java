import java.util.Scanner;

public class Ejercicio2 {
	public static void ejercicio2(){
		Scanner scanner = new Scanner(System.in);
		String frase;
		int MAX_LONGITUD = 80;
		int contmayus= 0;
		int contminus = 0;
		System.out.println("Introduce una frase");
		frase = scanner.nextLine();
		while(frase.length()>MAX_LONGITUD){
			System.out.println("La frase tiene m�s de "+ MAX_LONGITUD +" car�cteres, introduce una frase con menos de 80.");
			frase = scanner.nextLine();
		}
		for (int i=0; i<frase.length();i++){
			if (frase.charAt(i)>=65 && frase.charAt(i)<=90){
				contmayus+=1;
			}else if (frase.charAt(i)>=97 && frase.charAt(i)<=122){
				contminus+=1;
			}
		}
		System.out.println("El n�mero de caracteres may�sculos es: "+contmayus);
		System.out.println("El n�mero de caracteres min�scuos es: "+contminus);
	}

}
