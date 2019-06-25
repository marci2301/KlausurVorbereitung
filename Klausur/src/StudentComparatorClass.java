import java.util.Comparator;

public class StudentComparatorClass implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getMatrikelnr() - s2.getMatrikelnr();
	}

}
