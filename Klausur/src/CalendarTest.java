import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar();
		DateFormat time = DateFormat.getTimeInstance();
		DateFormat date = DateFormat.getDateInstance();
		DateFormat sdf = new SimpleDateFormat("EEEE dd.MM.yyyy");
		
		System.out.println(date.format(cal.getTime()));
		System.out.println(time.format(cal.getTime()));
		System.out.println(sdf.format(cal.getTime()));
		
		cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
		System.out.println(date.format(cal.getTime()));
		
		cal.set(2000, 0, 22, 22, 22);
		System.out.println(date.format(cal.getTime()));
		
	}

}
