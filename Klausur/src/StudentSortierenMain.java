import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSortierenMain {

	public static void main(String[] args) {
		
		ArrayList<Student> sliste = new ArrayList<Student>();
		
		Student a = new Student("A", 123123, 5);
		Student b = new Student("B", 123345, 5);
		Student c = new Student("C", 123555, 5);
		Student d = new Student("D", 123111, 5);
		Student e = new Student("E", 123222, 5);
		
		sliste.add(a);
		sliste.add(b);
		sliste.add(c);
		sliste.add(d);
		sliste.add(e);
		
		System.out.println("Unsortierte Ausgabe: ");
		for(Student s : sliste) {
			System.out.println(s.toString());
		}
		
		System.out.println("Erste Ausgabe: ");
//		Collections.sort(sliste);                                     // Standardsortierung in Student über Comparable und compareTo()
//		Collections.sort(sliste,new Student.StudentComp());           // Sortierung über innere Klasse in Student
//		Collections.sort(sliste, new StudentComparatorClass());       // Sortierung über eigene Comparator Klasse
		Collections.sort(sliste, new Comparator<Student>() {          // Ad-hoc, anonyme Klasse Comparator
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getMatrikelnr() - s2.getMatrikelnr();
			}
		});
		for(Student s : sliste) {
			System.out.println(s.toString());
		}
		
		

	}

}
