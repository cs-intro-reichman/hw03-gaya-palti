/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int month = 1; month <= 12; month ++){
			System.out.println("Month " + month + " has " + nDaysInMonth(month, year) + " days");
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		int days = 31;
		switch (month) {
			case 1: days = 31; break;
			case 2: if (isLeapYear(year)) {
						days = 29; 	
					} else {
						days = 28; 
					} 
					break;
			case 3: days = 31; break;
			case 4: days = 30; break;					
			case 5: days = 31; break;
			case 6: days = 30; break;	
			case 7: days = 31; break;
			case 8: days = 31; break;
			case 9: days = 30; break;
			case 10: days = 31; break;	
			case 11: days = 30; break;
			case 12: days = 31; break;				
			}
		return days;
	}
}

