import java.util.HashMap;
import java.util.Map;

public class HashMapMain2 {

	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("yoo", "2.5");
		hm.put("Eins", "1");
		hm.put("Zwei", "2");
		hm.put("Drei", "3");
		
		System.out.println("Ausgabe 1: ");
		for(Map.Entry<String, String> e : hm.entrySet()) {
			System.out.println(e.getKey() +";"+ e.getValue());
		}
		
		System.out.println("________________________________________________ \nAusgabe 2:");		
		System.out.println(hm);
		
		System.out.println("________________________________________________ \nAusgabe 3:");
		System.out.println();
	}

}
