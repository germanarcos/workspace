import java.util.Scanner;
public class Ejercicio9 {
	public static void ejercicio9(){
		String persona;
		int conth1 = 0;
		int conth2 = 0;
		int contm1 = 0;
		int contm2 = 0;
		int codcorr = 0;
		Scanner scanner = new Scanner(System.in);
		do{		
			System.out.println("Introduce un c�digo, para salir 00000000");
			persona = scanner.next();
			if(persona.substring(0, 3).equals("199")){//Tres primeros car�cteres
				if(persona.charAt(3)>=48 && persona.charAt(3)<=53){
					if(persona.charAt(4)==72 || persona.charAt(4)==77){//Es h o m
						if(persona.charAt(5)==49 || persona.charAt(5)==50){//Curso 1 o 2(codigo valido)
							codcorr+=1;
							if(persona.charAt(5)==49){//curso 1
								if(persona.charAt(4)==72){//curso 1 y es H
									conth1+=1;
								}
								else{//curso 1 y es M
									contm1+=1;
								}

							}else{
								if(persona.charAt(4)==72){//curso2 y es H
									conth2+=1;
								}
								else{//curso 2 y es M
									contm2+=1;
								}
							}
						}//fin codigo valido

					}

				}
			}
		}while(!persona.equals("00000000"));
		if(codcorr>0){
			System.out.println("Hay "+conth1+" hombres matriculados en primero");
			System.out.println("Hay "+contm1+" mujeres matriculados en primero");
			System.out.println("Hay "+conth2+" hombres matriculados en segundo");
			System.out.println("Hay "+contm2+" mujeres matriculados en segundo");
			System.out.println("Han sido le�dos "+codcorr+" c�digos correctos");
		}else{
			System.out.println("No se ha introducido ning�n c�digo correcto.");
		} 
	}

}
