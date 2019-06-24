
public abstract class AbstractDruckbar {
	
	public abstract void drucke();
	private String papierFormat = "A4";
	
	public void ausdrucken(){
		System.out.println("Papierformat: " + papierFormat);		
	}

}
