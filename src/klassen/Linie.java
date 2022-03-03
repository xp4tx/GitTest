package klassen;

public class Linie {
	private Punkt p1;
	private Punkt p2;
	
	public Punkt getP1() {
		return p1;
	}
	public void setP1(Punkt p1) {
		this.p1 = p1;
	}
	public Punkt getP2() {
		return p2;
	}
	public void setP2(Punkt p2) {
		this.p2 = p2;
	}
	
	public Linie(Punkt p1, Punkt p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	public Linie() {
		super();
	}
	
}
