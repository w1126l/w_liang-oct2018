import java.util.*;

public class Hourglass {
	
	public static void base(int length) {
		System.out.print("|");
		for (int i = 1; i <= length; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void topHalf(int length) {
		
	}
	
	public static void middle(int length) {
		length = (length / 2);
		String spaces = "";
		int count = 1;
		while (count <= length) {
			count++;
			spaces += " ";
		}
		System.out.print(spaces);
		System.out.println("||");
	}

	public static void bottomHalf(int length) {
		
	}
	
	public static void main(String[]args) {
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("How long would you like your hourglass to be?");
		int length = userInput.nextInt();
		
		Hourglass.base(length);
		Hourglass.topHalf(length);
		Hourglass.middle(length);
		Hourglass.bottomHalf(length);
		Hourglass.base(length);
		
		userInput.close();
	}
}