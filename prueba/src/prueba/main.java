package prueba;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "13~313()=";
		byte[] bite = new byte[frase.length()];
		bite = frase.getBytes();
		for (int i=0; i<bite.length; i++){
			System.out.print(bite[i] + " ");
			System.out.println((char)bite[i]);
		}
		System.out.println("A ver como\nfunciona lo del salto");
	}

}
