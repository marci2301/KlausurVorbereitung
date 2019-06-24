import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Eins", 1);
		hm.put("Zwei", 2);
		hm.put("Drei", 3);
		hm.put("Zwei", 5);
		hm.remove("Eins");

		for(Map.Entry<String, Integer> entry : hm.entrySet()){
			System.out.println(entry.getKey() +"; " + entry.getValue());
		}
	}
}
