import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class MaxMultiplication {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>(3);

		System.out
				.println("Please, provide sequence of digits, each separated by comma: ");
		Scanner scan = new Scanner(System.in);
		String inputArr = scan.next();

		// System.out.println(inputArr);

		// add digits in ArrayList of Integers
		for (String iter : inputArr.split(",")) {
			arr.add(Integer.parseInt(iter));
		}

		// Sorting the ArrayList
		Collections.sort(arr);
		
		// System.out.println(arr.size());

		for (Integer integer : arr) {
			System.out.print(integer + "; ");
		}

		System.out.println();

		int lastIndex = arr.size() - 1;

		int multOfBiggest = arr.get(lastIndex) * arr.get(lastIndex - 1)
				* arr.get(lastIndex - 2);
		// System.out.println("A= " + multOfBiggest);

		int multBiggestBySmallestTwo = arr.get(0) * arr.get(1)
				* arr.get(lastIndex);
		// System.out.println("B= " + multBiggestBySmallestTwo);

		int result = Math.max(multOfBiggest, multBiggestBySmallestTwo);

		if (result == multOfBiggest) {
			System.out.println("The three digits with max multiplication are: "
					+ arr.get(lastIndex) + ", " + arr.get(lastIndex - 1) + ", "
					+ arr.get(lastIndex - 2) + " and it is " + result);
		} else {
			System.out.println("The three digits with max multiplication are: "
					+ arr.get(lastIndex) + ", " + arr.get(1) + ", "
					+ arr.get(0) + " and it is " + result);
		}

	}
}
