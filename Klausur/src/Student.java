import java.util.Comparator;

public class Student implements Comparable<Student> {
	
	private String name;
	private int creditpoints;
	private int matrikelnr;
	
	public Student(String name, int matrikelnr, int creditpoints) {
		this.name = name;
		this.creditpoints = creditpoints;
		this.matrikelnr = matrikelnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditpoints() {
		return creditpoints;
	}

	public void setCreditpoints(int creditpoints) {
		this.creditpoints = creditpoints;
	}

	public int getMatrikelnr() {
		return matrikelnr;
	}

	public void setMatrikelnr(int matrikelnr) {
		this.matrikelnr = matrikelnr;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.matrikelnr - s.getMatrikelnr();
	}
	
	public static class StudentComp implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getMatrikelnr() - s2.getMatrikelnr();
		}
	}
	
	public String toString() {
		return "Name: " + this.name + ", Matrikelnr: " + this.matrikelnr + ", Creditpoints: " + this.creditpoints;
	}

}
