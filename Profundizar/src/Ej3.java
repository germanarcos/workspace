import java.util.Scanner;
public class Ej3 {
	public static void ej3(){
		char[] simbolos = new char[]{'$','#','%','<','>','@'};
		String tirada;
		String entrada;
		String premio;
		int contador=0;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Introduce cualquier cosa para tirar, x para salir");
			entrada = teclado.next();
			if(!entrada.equalsIgnoreCase("x")){
				tirada="";
				for(int i = 0;i<3;i++){
					tirada+=simbolos[(int)(Math.random()*simbolos.length)];
				}
				switch(tirada){
				case "$$$":
					premio="Has ganado 50 euros";
					break;
				case "$@@":
					premio="Has ganado 25 euros";
					break;
				case "$##":
					premio="Has ganado 15 euros";
					break;
				case "@@@":
					premio="Has ganado 10 euros";
					break;
				case "@##":
					premio="Has ganado 5 euros";
					break;
				case "@$$":
					premio="Has ganado 3 euros";
					break;
				case "###":
					premio="Has ganado 1 euros";
					break;
				case "%%%":
					premio="Has ganado 1 euros";
					break;
				case "<<<":
					premio="Has ganado 1 euros";
					break;
				case ">>>":
					premio="Has ganado 1 euros";
					break;
				case "$@%":
					premio="Has ganado 1 euros";
					break;
				default:
					premio="La tirada "+tirada+" no est� premiada";
				}
				System.out.println(tirada+"\n"+premio);
				contador++;
				System.out.println("Has tirado "+contador+" veces");
			}
		}while(!entrada.equalsIgnoreCase("x"));
	}
}
