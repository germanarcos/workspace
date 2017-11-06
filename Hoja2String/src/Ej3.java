import java.util.Scanner;
public class Ej3 {
	public static void ej3(){
		Scanner teclado = new Scanner(System.in);
		String palabra;
		boolean palindromo = true;
		System.out.println("Introduce una palabra");
		palabra = teclado.next();
		for(int i= 0;i<(palabra.length()/2) && palindromo==true;i++){
			if(palabra.charAt(i)==palabra.charAt(palabra.length()-1-i)){
				palindromo = true;
			}

			else{
				palindromo = false;
			}
		}
	if(palindromo==true){
		System.out.println("La palabra " + palabra + " es un palíndromo.");
	}
	else{
		System.out.println("La palabra " + palabra + " no es un palíndromo.");
	}
}//fin metodo

}
