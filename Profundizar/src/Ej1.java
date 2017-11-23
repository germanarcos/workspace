import java.util.Scanner;
public class Ej1 {
	public static void ej1(){
		boolean correcto;
		boolean victoria = false;
		Scanner sc = new Scanner(System.in);
		int intentos = 10;
		int indice=0;
		int[] letras = new int[26];
		String errores ="";
		for(int i=0;i<26;i++){
			letras[i]= 0;
		}
		String intento;
		char intent;
		int longitud;
		String palabratmp ="";
		String palabra ="";
		String[] posibles = new String[]{"Patata","Croqueta","Mortadela","Bocadillo","Chuleta","Hamburguesa",
				"Tortilla","Panceta","Mesa","Paella","Torre","Legumbre","Chipirones","Churrasco","Zorro"};
		longitud = posibles.length;
		int valor = Random.random(longitud, 0);
		System.out.println(posibles[valor]);
		for(int i = 0;i<posibles[valor].length();i++){
			palabra += "*";
		}
		System.out.println(palabra);

		do{
			palabratmp="";
			correcto = false;
			System.out.println("Introduce una letra");
			intento = sc.next().toLowerCase();
			intent = intento.charAt(0);
			System.out.println(intento);
			System.out.println((int)intent);
			if(intent>=97 && intent<=122){
				indice = intent-97;
				correcto=true;
			}
			else{
				System.out.println("No has introducido una letra.");
				correcto = false;
			}if(correcto==true){
				if(letras[indice]==1){
					System.out.println("Ya has introducido esa letra");
				}else{
					intentos--;
					letras[indice]=1;
					for(int pos = 0;pos<posibles[valor].length();pos++){
						if(intent==posibles[valor].toLowerCase().charAt(pos)){
							palabratmp += posibles[valor].charAt(pos);
						}else{
							palabratmp += palabra.charAt(pos);
						}
					}
					palabra = palabratmp;
				}
			}
			System.out.println(palabra);
				if(palabra.contains("*") == false){
					System.out.println("�Has ganado!");
					victoria = true;
			}else{
				
				System.out.println("Te quedan "+intentos+" intentos.");
			}
			
		}while(intentos>0&&victoria==false);
	}
}
