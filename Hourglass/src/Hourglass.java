import java.util.*;

public class Hourglass {
	
	public static void main(String[] args) {
		
		System.out.println("How long would you like your hourglass to be?\n");
		Scanner userInput = new Scanner(System.in);
		
		int length = userInput.nextInt();
		
		if (length <= 2) {
			
			System.out.println("Base cannot be an integer smaller than or equal to 2.");
			
		} else if (length % 2 == 0) {
			
			System.out.println(base(length));
			topHalf(length);
			System.out.println(middle(length));
			bottomHalf(length);
			System.out.println(base(length));
		
		} else {
			
			System.out.println("Base cannot be an odd number.");
		}
		
		userInput.close();

	}
	
	public static String base(int length) {
		
		String base = "|";
		for (int i = 1; i <= length; i++) {
			base += ("\"");
		}
		base += "|";
		return base;
		
	}
	
	public static void topHalf(int length) {
		
		int colons = (length - 2);
		int rows = ((length - 2) / 2);
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			System.out.print("\\");
			
			for (int k = 0; k < colons; k++) {
				System.out.print(":");
			}
			colons -=2;
			
			System.out.println("/");
			
		}
		
	} 
	
	public static String middle(int length) {
		
		int middle = (length / 2);
		String spaces = "";
		
		for (int i = 1; i <= middle; i++) {
			spaces += " ";
		}
		return spaces + "||";
		
	}
	
	public static void bottomHalf(int length) {
		
		int middle = (length / 2);
		int rows = ((length - 2) / 2);
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = middle; j > i + 1; j--) {
				System.out.print(" ");
			}
			
			System.out.print("/");
			
			for (int k = 0; k < (2 * (i + 1)); k++) {
				System.out.print(":");
			}

			System.out.println("\\");
			
		}
		
	}
	
}