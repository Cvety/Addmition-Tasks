
public class DayOfDate {
	public static void main(String[] args) {

		// System.out.println("Please, enter date in format dd.mm");
		// Scanner input = new Scanner(System.in);
		// List<Integer> dateSplited = new ArrayList<Integer>();
		// int day;
		// int month;
		//
		// String Str = new String(input.next());
		// System.out.println("Return Value :");
		//
		// for (String retval : Str.split("\\.")) {
		// // System.out.println(retval);
		// dateSplited.add(Integer.parseInt(retval));
		// }
		// day = dateSplited.get(0);
		// month = dateSplited.get(1);
		//
		// System.out.println(day + " and " + month);
		//
		// isLeapYear(2000);

		int day = 3;
		int monthValue = 4;
		int centuryCode = 6;
		int daysOfWeek = 7;
		int counter = 0;

		for (int i = 2000; i <= 2099; i++) {
			int lastTwoDigits = i % 100;
			int result = (((lastTwoDigits / 4) + day + monthValue + centuryCode) + lastTwoDigits)
					% daysOfWeek;

			// System.out.println(lastTwoDigits);
			// System.out.println(result);
			if (result == 4) {
				counter++;
				System.out.println("Year: " + i);
			}

		}
		System.out
				.println("In the last century the date 3 March is happened to be on Wednesday "
						+ counter + " times");

	}

	public static void isLeapYear(int year) {
		boolean isLeapYear = false;
		if ((year % 100 != 0 || year % 400 == 0) && year % 4 == 0) {
			isLeapYear = true;
			System.out.println(isLeapYear);
		} else {
			System.out.println(isLeapYear);
		}

	}

	public void mainLogic(boolean isLeap) {

	}
}
