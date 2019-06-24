
public class ExceptionMain {

	public static void main(String[] args) {
		
		try {
			berechne();
		}
		catch(MyException me) {
			System.out.println(me.getMessage());
		}

	}
	
	public static void berechne() throws MyException{
		
		int x = 1; //einlesen
		int y = 101; //einlesen
		
		if(x < 1 || y > 100) {
			throw new MyException("Wert x: " + x + " oder Wert y: " + y + " ist falsch!");
			
			// oder throw new MyException(x,y);
		}
	}

}

// IOException -> Fehler beim Lesen oder Schreiben
// NumberFormatException --> Fehler beim Umwandeln von String nach Zahl
// ParseException
// NullPointerException
// IndexOutOfBoundsException
// FileNotFoundException
