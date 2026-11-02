package figuras;

public class Centrs {
	private int x, y;
	
	public Centrs(int x, int y) {
		this.x = x;
		this.y = y;
	}// Centrs constructor
	
	public String izvaditKoordinatas() {
		return "Punkts atrodas:\nx= " + x + ", y = " + y;
	}// izvaditKoordinatas
	
	public void parvietot(int parvX, int parvY) {
		x += parvX;
		y += parvY;
	}// parvietot
	
}
