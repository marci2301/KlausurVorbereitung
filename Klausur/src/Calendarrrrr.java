import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendarrrrr {
	
	private static Calendar cal;
	
	public static void main(String[] args) {
		
		cal = new GregorianCalendar();
		
		System.out.println(cal);
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		DateFormat df1 = DateFormat.getTimeInstance();
		
		System.out.println(df.format(cal.getTime()));
		System.out.println(df1.format(cal.getTime()));
		
		cal.add(GregorianCalendar.DAY_OF_MONTH, +6); // manuell 6 Tage drauf rechnen
		System.out.println(df.format(cal.getTime()));
		
		cal.setTime(Calendar.getInstance().getTime());
		System.out.println(df1.format(cal.getTime()));
		
		
		
	}

}
