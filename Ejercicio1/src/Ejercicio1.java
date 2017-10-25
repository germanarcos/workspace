import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {
String ent = "";
int k;
int A;

A = 1;

Scanner teclado = new Scanner(System.in);
System.out.println("Introduce si o no");
ent = teclado.next();

if (ent.equals("si")){
System.out.println("Has seleccionado "+ent+", imprimiendo numeros.");
for(k = 1; k <= 100; k = k + 1){
System.out.println(A * k);
}
}else{
System.out.println("Has seleccionado "+ent+", saliendo.");
}

}

}