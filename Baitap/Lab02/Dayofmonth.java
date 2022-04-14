import java.util.Scanner;
public class Dayofmonth{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the month:");
		String month = keyboard.nextLine();
		System.out.println("Enter the year:");
		int year = keyboard.nextInt();

		int monthint;

		boolean leapYear = 
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		switch(month)
		{
			case "January":
				monthint = 1; break;
			case "Jan.":
				monthint = 1; break;
			case "Jan":
				monthint = 1; break;
			case "1":
				monthint = 1; break;

			case "February":
				monthint = 2; break;
			case "Feb.":
				monthint = 2; break;
			case "Feb":
				monthint = 2; break;
			case "2":
				monthint = 2; break;

			case "March":
				monthint = 3; break;
			case "Mar.":
				monthint = 3; break;
			case "Mar":
				monthint = 3; break;
			case "3":
				monthint = 3; break;

			case "April":
				monthint = 4; break;
			case "Apr.":
				monthint = 4; break;
			case "Apr":
				monthint = 4; break;
			case "4":
				monthint = 4; break;

			case "May":
				monthint = 5; break;
			case "5":
				monthint = 5; break;

			case "June":
				monthint = 6; break;
			case "Jun":
				monthint = 6; break;
			case "6":
				monthint = 6; break;

			case "July":
				monthint = 7; break;
			case "Jul":
				monthint = 7; break;
			case "7":
				monthint = 7; break;

			case "August":
				monthint = 8; break;
			case "Aug.":
				monthint = 8; break;
			case "Aug":
				monthint = 8; break;
			case "8":
				monthint = 8; break;

			case "September":
				monthint = 9; break;
			case "Sept.":
				monthint = 9; break;
			case "Sep":
				monthint = 9; break;
			case "9":
				monthint = 9; break;

			case "October":
				monthint = 10; break;
			case "Oct.": 
				monthint = 10; break;
			case "Oct":
				monthint = 10; break;
			case "10":
				monthint = 10; break;

			case "November":
				monthint = 11; break;
			case "Nov.":
				monthint = 11; break;
			case "Nov":
				monthint = 11; break;
			case "11":
				monthint = 11; break;

			case "December":
				monthint = 12; break;
			case "Dec.":
				monthint = 12; break;
			case "Dec":
				monthint = 12; break;
			case "12":
				monthint = 12; break;

			default:
				monthint = 3; break;
		}	

		switch(monthint)
		{
			case 1: System.out.println(
					 "January " + year + " had 31 days"); break;
			case 2: System.out.println("February " + year + " had" +
					  ((leapYear) ? " 29 days" : " 28 days")); break;
			case 3: System.out.println(
					 "March " + year + " had 31 days"); break;
			case 4: System.out.println(
					 "April " + year + " had 30 days"); break;
			case 5: System.out.println(
					 "May " + year + " had 31 days"); break;
			case 6: System.out.println(
					 "June " + year + " had 30 days"); break;
			case 7: System.out.println(
					 "July " + year + " had 31 days"); break;
			case 8: System.out.println(
					 "August " + year + " had 31 days"); break;
			case 9: System.out.println(
					 "September " + year + " had 30 days"); break;
			case 10: System.out.println(
					 "October " + year + " had 31 days"); break;
			case 11: System.out.println(
					 "November " + year + " had 30 days"); break;
			case 12: System.out.println(
					 "December " + year + " had 31 days");
		}

	}
}