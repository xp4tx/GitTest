package klassen;

public class Zahl {
	private double wert;

	public double getWert() {
		return wert;
	}

	public void setWert(double wert) {
		this.wert = wert;
	}

	public Zahl(double wert) {
		super();
		this.wert = wert;
	}
	
	public Zahl add(Zahl zahl) {
		return new Zahl(this.getWert() + zahl.getWert());
	}
	
	public Zahl sub(Zahl zahl) {
		return new Zahl(this.getWert() - zahl.getWert());
	}
	
	public Zahl mul(Zahl zahl) {
		return new Zahl(this.getWert() * zahl.getWert());
	}
	
	public Zahl div(Zahl zahl) {
		return new Zahl(this.getWert() / zahl.getWert());
	}
}
