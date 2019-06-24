
public class MyException extends Exception {
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException(int i, int x) {
		super("Wert nicht zwischen " + i + " und " + x);
	}
}
