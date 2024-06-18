package Task5;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
public static void getDayMonthYear(String date) {
	LocalDate parseDate = LocalDate.parse(date);
	LocalDate curDate = LocalDate.now();
	
	Period period = Period.between(parseDate, curDate);
	System.out.println(period.getYears()+"Years,"+period.getMonths()+"Months,"+period.getDays()+"Days");
	
	}
	public static void main(String arg[]) {
		String date ="1992-04-05";
		getDayMonthYear(date);
		
	}
}
