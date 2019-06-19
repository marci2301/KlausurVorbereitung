
public class Kunde {
	
	private String name;
	private int kundenNr;
	private boolean hatKundenkarte;
	
	public Kunde(int kundenNr, String name, boolean hatKundenkarte) {
		super();
		this.name = name;
		this.kundenNr = kundenNr;
		this.hatKundenkarte = hatKundenkarte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKundenNr() {
		return kundenNr;
	}

	public void setKundenNr(int kundenNr) {
		this.kundenNr = kundenNr;
	}

	public boolean isHatKundenkarte() {
		return hatKundenkarte;
	}

	public void setHatKundenkarte(boolean hatKundenkarte) {
		this.hatKundenkarte = hatKundenkarte;
	}

	@Override
	public String toString() {
		return "Kunde [name=" + name + ", KundenNr=" + kundenNr + ", hatKundenkarte=" + hatKundenkarte + "]";
	}
}
