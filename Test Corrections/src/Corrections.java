public class Corrections {

	public static void main(String[] args) {
		
		numSix();
		numSeven();
		numNine();
		
	}
	
	public static void numSix() {
		
		double idealWidth = 72.0;
		double currWidth = 36.0;
		boolean done = false;
		while (!done) {
			if (currWidth != idealWidth) {
				currWidth = idealWidth;
				done = true;
			} else {
				System.out.println("Ideal width.");
			}
		}
		System.out.println("Ready to Start");
	}
	
	public static void numSeven() {
		
		String s = "Hi APCS! ";
		int n = 3;
		for (int i = 0; i < n; i++) {
			s += s;
		}
		System.out.println(s);
	}
	
	public static void numNine() {
		
		System.out.println(0.7 * 10 + 15 / 2 - 8 / 4);
		System.out.println(4 * 5 + 3 + 30 % 7);
		System.out.println("countdown 10 " + 9 * 8);
	}
	
}
