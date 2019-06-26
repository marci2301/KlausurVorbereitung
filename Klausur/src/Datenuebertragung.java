import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Datenuebertragung {

	public static void main(String[] args) {
		
		List<Integer> il = new ArrayList<Integer>();
		
		il.add(1);
		il.add(2);
		il.add(5);
		il.add(4);
		il.add(new Integer(10));
		
		System.out.println("ArrayList\n" + il);
		
		Integer[] ia = il.toArray(new Integer[il.size()]);
		
		System.out.println("Array");
		for(int i=0; i<ia.length; i++) {
			System.out.print(ia[i] + ", ");
		}
		
		List<Integer> ill = new LinkedList<Integer>();
		for(Integer i : il) {
			ill.add(i);
		}
		
		System.out.println("\nLinkedList");
		System.out.println(ill);		
		
		il.add(888);
		il.add(7777);
		ill.add(777);
		il.remove(2);
		ill.removeAll(il);
		System.out.println(ill);	
		System.out.println(il);
	}
}
