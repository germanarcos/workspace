import java.util.Scanner;
public class Ejercicio8 {
	public static void ejercicio8(){
		Scanner scanner = new Scanner(System.in);
		String frase;
		String frmayus;
		int num;
		boolean fin = true;
		boolean mayus;
		do{
			System.out.println("Introduce una frase");
			frase = scanner.nextLine();
			fin = true;
			mayus = false;
			for(int i=0; i<frase.length() && fin == true;i++ ){
				if(frase.charAt(i)>=97 && frase.charAt(i)<=122){
					fin = false;
				}
				if(i==(frase.length()-1)){
					mayus = true;
				}
			}
		}while (mayus == false);
		System.out.println("Introduce un n�mero");
		num = scanner.nextInt();
		for(int i=0; i<frase.length();i++){
			System.out.print((char)(frase.charAt(i)+num));
		}
	}

}
