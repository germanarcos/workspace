import java.util.Scanner;
public class Ej2 {
	public static void ej2(){
		Scanner scanner = new Scanner(System.in);
		String s1;
		int i, conta=0;
		char a;
		System.out.println("Escribe una frase");
		s1 = scanner.nextLine();
		System.out.println("Escribe una letra");
		a = scanner.next().charAt(0); //pedir char por teclado
		for (i=0; i<s1.length(); i++){
			if(s1.charAt(i)==a){
				if(conta==0 || conta==1 || conta==2){
				}
				else{
					System.out.print(s1.charAt(i));
				}
				conta++;
			}else{
				System.out.print(s1.charAt(i));
			}
		}
	}
}
