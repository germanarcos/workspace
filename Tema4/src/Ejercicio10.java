import java.util.Scanner;
public class Ejercicio10 {

	public static void ejercicio10(){
		Scanner scanner = new Scanner(System.in);
		String frase;
		boolean seguir = true;
		boolean mayus;
		int[] letras = new int[25];
		do{//filtro mayusculas
			System.out.println("Introduce una frase");
			frase = scanner.nextLine();
			while(frase.length()>60){
				System.out.println("Introduce una frase menor de 60 carácteres");
				frase = scanner.nextLine();
			}
			seguir = true;
			mayus = false;
			for(int i=0; i<frase.length() && seguir == true;i++ ){
				if(frase.charAt(i)>=65 && frase.charAt(i)<=90){
					seguir = true;
					if(i+1==frase.length()){
						mayus = true;
					}
				}else{
					seguir = false;
				}
			}
		}while (mayus == false);//fin filtro mayus
		for(int i = 0; i<frase.length();i++){
			letras[(frase.charAt(i)-65)] += 1;
		}
	}
}
