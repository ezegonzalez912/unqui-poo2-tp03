package ar.unq.tp3.ej03;

public class Multiplos {
	
	public int mayorMultiplo(int x, int y) {
		
		int result = -1;
		
		for (int i = 0; i < 1000; i++) {
			if(i % x == 0 && i % y == 0 && i != 0) {
				result = i;
			}
		}
		
		return result;
	}
	
}
