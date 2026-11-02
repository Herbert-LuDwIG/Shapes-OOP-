package figuras;

public class Cetrsturis {

	public int platums, augstums;
	public Centrs punkts;// Centrs object, it ka sastavdala no cetrsturis
	
	// Constructor overload
	public Cetrsturis() {
		punkts = new Centrs(0, 0);
		platums = 4;
		augstums = 6;
	}// Cetrsturis constructor
	
	public Cetrsturis(Centrs p) {
		punkts = p;
		platums = 4;
		augstums = 3;
	}// Cetrsturis constructor
	
	public Cetrsturis(int platums, int augstums) {
		punkts = new Centrs(-5, 5);
		this.platums = platums;
		this.augstums = augstums;
	}// Cetrsturis constructor
	
	public Cetrsturis(Centrs p, int platums, int augstums) {
		punkts = p;
		this.platums = platums;
		this.augstums = augstums;
	}// Cetrsturis constructor
	
	public int CetrLaukums() {
		return platums * augstums;
	}// CetrLaukums
	
}
