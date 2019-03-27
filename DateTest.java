import java.time.LocalDate;
import java.time.DayOfWeek;

public class DateTest{
	public static void main(String[] args){
		LocalDate today = LocalDate.now();
		int month = today.getMonthValue();
		LocalDate a = today.minusDays(today.getDayOfMonth() - 1);
		DayOfWeek weekday = a.getDayOfWeek();

		for(int i = 1; i < weekday.getValue(); i++)
			System.out.print("    ");
		while(a.getMonthValue() == month){
			System.out.printf("%3d",a.getDayOfMonth());
			if(a.getDayOfMonth() == today.getDayOfMonth()){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			a = a.plusDays(1);
			if(a.getDayOfWeek().getValue() == 1)System.out.println();
		}
	}
}
