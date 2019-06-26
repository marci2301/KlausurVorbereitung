import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {

		DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		DateFormat sdf2 = new SimpleDateFormat("EEEE ', der ' dd. MMMM yyyy");
		Date d1 = null;

		String s = "23.01.1996";
		String s2 = "29.01.1956";

		try {
			d1 = sdf.parse(s);
			Date d2 = sdf.parse(s2);

			long l = d2.getTime() - d1.getTime();
			l = l / (1000 * 60 * 60 * 24);

			System.out.println("Differenz beträgt: " + l);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Asugabe SimpleDateFormat 2: " + sdf2.format(d1));
	}
}
