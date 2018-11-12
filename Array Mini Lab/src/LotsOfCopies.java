import java.util.Arrays;

public class LotsOfCopies {
	
	public static void main(String[] args) {
		
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		
		changeMe(num, strMain, arrMain);
		
		System.out.println("Part One:");
		System.out.println();
		System.out.println("num: " + num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		
		System.out.println();
		System.out.println();
	
		System.out.println("Part Two:");
		System.out.println();
		partTwoInt(5, 10);
		System.out.println();
		partTwoString("Hello", "Goodbye");
		System.out.println();
		
		int[] startArray = {1, 2, 3};
		partTwoArray(startArray, 5);
		
	}
	
	public static void changeMe(int x, String str, int[] arr) {
		
		x++;
		str += str;
		arr[2] = 42;
		
	}
	
	public static void partTwoInt(int startValue, int newValue) {
		
		System.out.println("Changing integers:");
		int a = startValue;
		System.out.println("a in the beginning: " + a);
		int b = a;
		System.out.println("b in the beginning: " + b);
		System.out.println("After changing value a ...");
		a = newValue;
		System.out.println("a afterwards: " + a);
		System.out.println("b afterwards: " + b);

		
	}
	
	public static void partTwoString(String startString, String newString) {
		
		System.out.println("Changing strings:");
		String a = startString;
		System.out.println("a in the beginning: " + a);
		String b = a;
		System.out.println("b in the beginning: " + b);
		System.out.println("After changing string a ...");
		a = newString;
		System.out.println("a afterwards: " + a);
		System.out.println("b afterwards: " + b);
		
	}
	
	public static void partTwoArray(int[] startArray, int newValue) {
		
		System.out.println("Changing arrays:");
		int[] a = startArray;
		System.out.println("a in the beginning: " + Arrays.toString(a));
		int[] b = a;
		System.out.println("b in the beginning: " + Arrays.toString(b));
		System.out.println("After changing array a ...");
		a[1] = newValue;
		System.out.println("a afterwards: " + Arrays.toString(a));
		System.out.println("b afterwards: " + Arrays.toString(b));
		
	}
	
}
