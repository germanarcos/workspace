import java.util.Scanner;
public class Ejercicio6 {

	public static void ejercicio6(){
		String frase;
		Scanner scanner = new Scanner(System.in);
		int MAX_LONGITUD = 80;
		int num=0;
		int cons=0;
		int voc=0;
		boolean vow = false;
		do{
			System.out.println("Introduce una frase menor de 80 caracteres");
			frase = scanner.nextLine();
		}while(frase.length()>MAX_LONGITUD);
		for(int i = 0; i<frase.length();i++){
			vow = false;
			if(frase.charAt(i)>=48 && frase.charAt(i)<=57){
				num +=1;
			}//if
			else if(frase.charAt(i)==65 || frase.charAt(i)==69 || frase.charAt(i)==73 || frase.charAt(i)==79
					||frase.charAt(i)==85 || frase.charAt(i)==97 || frase.charAt(i)==101 || frase.charAt(i)==105 
					|| frase.charAt(i)==111 || frase.charAt(i)==117){
				vow = true;
				voc +=1;
			}//elseif
			if( ( (frase.charAt(i)>=65 && frase.charAt(i)<=90) || (frase.charAt(i)>=97 && frase.charAt(i)<=122) ) && vow == false ){
				cons +=1;
			}
			
		}//for
		System.out.println("La frase conten�a "+num+" n�meros, "+cons+" consonantes y "+voc+" vocales.");

	}//ejercicio6
}
