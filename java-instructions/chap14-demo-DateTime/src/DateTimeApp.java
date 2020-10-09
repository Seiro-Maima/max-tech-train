import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		LocalDate now1 = LocalDate.now();	// format yyyy-mm-dd
		LocalTime now2 = LocalTime.now();	// format hh:mm:ss.sss
		LocalDateTime now3 = LocalDateTime.now();	// format yyyy-mm-ddThh:mm:ss.sss
		
		System.out.println(now1);
		System.out.println(now2);
		System.out.println(now3);

		// using of() method
		LocalDate halloween2020 = LocalDate.of(2020, 10, 31);
		LocalDate newYears2020 = LocalDate.of(2020, 1, 1);
		
		System.out.println(halloween2020);
		System.out.println(newYears2020);
		
		// parse from String
		LocalDate thanksGiving2020 = LocalDate.parse("2020-11-26");
		System.out.println(thanksGiving2020);
		
		// show day of the week
		System.out.println("Halloween is on a " + halloween2020.getDayOfWeek());
		
		// examples of compare method
		System.out.println("Is Halloween before today? " + halloween2020.isBefore(now1));
		System.out.println("Compare today vs new years: " + now1.compareTo(newYears2020));
		
		// example of withMonth() method
		LocalDate sameDayNextMonth = now1.withMonth(11);
		System.out.println(sameDayNextMonth);
		
		// quietly changes the day
		LocalDate leapYear = LocalDate.of(2020, 2, 29);
		System.out.println(leapYear);
				LocalDate leapYear2021 = leapYear.withYear(2021);
		System.out.println(leapYear2021);
		
		// throws exception due to day of month issue
		LocalDate feb28th = LocalDate.of(2017, 02, 28);
		//LocalDate newDate = feb28th.withDayOfMonth(29);
		// System.out.println(newDate);					// Exception Invalid date - is not a leap year
		
		// add 2 months to the current date
		LocalDate twoMonthsAway = now1.plus(2, ChronoUnit.MONTHS);
		System.out.println(twoMonthsAway);
		
		// example of plus method
		System.out.println(twoMonthsAway.plusDays(17));
		
		// example of time between 2 dates
		System.out.println(ChronoUnit.DAYS.between(newYears2020, halloween2020));
		
		System.out.println("Bye!");
		
	}

}
