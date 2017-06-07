import java.util.Arrays;
import java.util.Comparator;

public class LargestNum {

	public static void main(String[] args) {

		int[] arr = new int[] { 24, 18, 302, 189, 97 };
		
		System.out.println(largestNumFromConcatenating(arr));
		
	}

	public static String largestNumFromConcatenating(int[] initialArr) {
		String[] arr = new String[initialArr.length];
		for (int i = 0; i < initialArr.length; i++) {
			arr[i] = String.valueOf(initialArr[i]);
		}

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String num1, String num2) {
				return (num2 + num1).compareTo(num1 + num2);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (String str : arr) {
			sb.append(str);
		}
		return sb.toString();
	}

}
