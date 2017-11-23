
public class Random {
	public static int random(int max, int min){
		max = max+1;
		int range = (max - min);
		return (int)(Math.random()* range + min);
	}
}
