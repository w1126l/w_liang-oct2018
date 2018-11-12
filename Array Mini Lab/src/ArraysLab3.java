import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
		
		System.out.println("STARTING ARRAYS:");
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		System.out.println("ARRAY 1: " + Arrays.toString(a1));
		System.out.println("ARRAY 2: " + Arrays.toString(a2));
		System.out.println();
		System.out.println();
		
		System.out.println("(SUM) Adding array 1 and 2 in the same index:");
		int[] sumArr = sum(a1, a2);
		System.out.println(Arrays.toString(sumArr));
		System.out.println();
		
		System.out.println("(APPEND) Adding 1 to array 1 and appending 200 to the end:");
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		System.out.println(Arrays.toString(appendArr));
		System.out.println();
		
		System.out.println("(REMOVE) Removing element from array 2 in index 5:");
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		System.out.println(Arrays.toString(removeArr));
		System.out.println();
		
		System.out.println("(SUM OF EVENS) Adding all even numbers in the appended array:");
		int sumOfEvens = sumEven(appendArr);
		System.out.println(sumOfEvens);
		System.out.println();
		
		System.out.println("(ROTATE RIGHT) Moving elements in array 1 to the right:");
		rotateRight(a1);		
		
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {
		
		int[] sum = new int[arr1.length];
		
		for (int i = 0; i < sum.length; i++) {
			sum[i] = arr1[i] + arr2[i];
		}
		
		return sum;
		
	}
	
	public static int[] append(int[] arr, int num) {
		
		int[] append = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			append[i] = arr[i] + 1;
		}
		append[arr.length] = num;
		
		return append;
		
	}
	
	public static int[] remove(int[] arr, int idx) {
		
		int[] remove = new int[arr.length - 1];
		
		for (int i = 0; i < idx; i++) {
			remove[i] = arr[i];
		}
		
		for (int i = idx; i < arr.length - 1; i++) {
			remove[i] = arr[i + 1];
		}
		
		return remove;
		
	}
	
	public static int sumEven(int[] arr) {
		
		int sumEven = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumEven += arr[i];
			}
		}
		
		return sumEven;
	}
	
	public static void rotateRight(int[] arr) {
		
		int last = arr[arr.length - 1];
		
		for (int i = arr.length - 1; i >= 1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = last;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
