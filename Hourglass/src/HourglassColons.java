public class HourglassColons {

	public static void colonTop(int colons) {
		String colon = "";
		for (int i = 1; i <= colons; i++) {
			colon += ":";
		}
		System.out.print(colon);
	}
	
	public static void colonBottom(int colons) {
		String colon = "";
		int count = 0;
		for (int i = 1; i <= colons; count =- 2) {
			while (colons > count) {
				colon += ":";
			}
		}
		System.out.print(colon);
	}
	
}
