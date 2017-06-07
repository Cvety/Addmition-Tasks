public class ConsecutiveArr {

	public static void main(String[] args) {
		int[] arr = { 5, 5, 4, 3, 1,5,23 };
		int arrSize = 7;
		int temp = 0;
		
		System.out.print("Initial array: ");
		for (int i = 0; i < arrSize; i++) {
			if (i == arrSize-1) {
				System.out.println(arr[i] + ";");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		System.out.print("Sorted array: ");
		for (int i = 0; i < arrSize; i++) {
			for (int j = 1; j < (arrSize - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arrSize; i++) {
			if (i == arrSize-1) {
				System.out.println(arr[i] + ";");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		for (int i = 0; i < arrSize - 1; i++) {
			if (arr[i + 1] != arr[i] + 1) {
				if(arr[i + 1] == arr[i]){
					System.out.println(arr[i+1] + " is repeated");
				}else{
				System.out.println(arr[i]+1 + " is missing. Instead that we have "+ arr[i+1]);
				}
			} else {
				continue;
			}
		}

	}
}
