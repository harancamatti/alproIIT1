package complexidadet1;

public class Contagem {
	private static long z;

	public static void add() {
		z++;
	}
	
	public static void add(long i) {
		z += i;
	}
	
	public static long getCounter() {
		return z;
	}

	public static void reset() {
		z = 0;
	}
}
