import java.util.Scanner;
public class Ejercicio8 {
	public static void ejercicio8(){
		Scanner scanner = new Scanner(System.in);
		String frase;
		String frmayus;
		int num;
		boolean seguir = true;
		boolean mayus;
		do{//filtro mayusculas
			System.out.println("Introduce una frase");
			frase = scanner.nextLine();
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
		System.out.println("Introduce un número");
		num = scanner.nextInt();
		for(int i=0; i<frase.length();i++){
			System.out.print((char)(frase.charAt(i)+num));
		}
	}

}
