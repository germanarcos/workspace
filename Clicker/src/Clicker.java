import java.util.LinkedList;
public class Clicker {
	public static void clicker(){
		LinkedList<pulsacion> clicks = new LinkedList<pulsacion>();
		LinkedList tiempo = new LinkedList();			
		pulsacion p = new pulsacion();
		p.pulsa();

		//pulsaciones
		do{//Como crear objetos con nombres "automatizados"
			pulsacion b = new pulsacion();
			b.pulsa();
			clicks.add(b);
			
		}while(p.comprueba()!='q');
	}

}
