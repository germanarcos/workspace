
public class trybingo {

	public static void main(String[] args) {
		int[][] carton = new int[3][5];
		int j=0, k=0, cont=0;
		boolean[] numeros = new boolean[90];
		int numeroAleatorio=0;
		boolean todoAcertado = false;
		int[] numeroSalido = new int[90];
		boolean loTienes = false;
		boolean fin;

		for(j=0; j<numeros.length; j++) {
			numeros[j]=false;
		}

		for(j=0; j<3; j++){
			for(k=0; k<5; k++) {
				numeroAleatorio=(int)Math.floor(Math.random()*90);
				do{ 
					numeroAleatorio=(int)Math.floor(Math.random()*90);
				}while(numeros[numeroAleatorio]==true);
				numeros[numeroAleatorio]=true;
				carton[j][k] = numeroAleatorio;
			}
		}//calculamos el carton

		for(j=0; j<3; j++){
			for(k=0; k<5; k++) {
				System.out.printf("%3d", carton[j][k]);
				if((k+1)%5==0){
					System.out.println();
				}
			}
		}//sacamos el carton por pantalla

		for(j=0; j<numeros.length; j++) {
			numeros[j]=false;
		}
		cont=0;
		do{
			loTienes=false;
			numeroAleatorio=(int)Math.floor(Math.random()*90);
			do{ 
				numeroAleatorio=(int)Math.floor(Math.random()*90);
			}while(numeros[numeroAleatorio]==true);
			numeros[numeroAleatorio]=true;
			numeroSalido[cont]=numeroAleatorio;
			cont++;

			for(j=0; j<3&&loTienes==false; j++){
				for(k=0; k<5&&loTienes==false; k++) {
					if(carton[j][k]==numeroSalido[cont-1]) {
						loTienes=true;
					}else {
						loTienes=false;
					}
				}
			}//comprobamos si lo tienes

			if(loTienes==true) {
				System.out.println("el numero " + numeroAleatorio + " lo tienes");
			}else {
				System.out.println("el numero " + numeroAleatorio + " no lo tienes");
			}//mostramos si lo tenemos o no
			fin = false;
			for(j=0; j<3&&fin==false; j++){
				for(k=0; k<5&&fin==false; k++) {
					loTienes=false;
					for(int l=0;l<90&&loTienes==false;l++){
						if(carton[j][k]==numeroSalido[l]){
							loTienes=true;
						}
						else if(l==cont-1){
							fin=true;
						}

					}
				}
			}
			if(fin==false){
				todoAcertado=true;
			}
		}while(todoAcertado==false);//calculamos bola que sale
		System.out.println("Has acertado shur");
	}

}
