package figuras;

public class Aplis {

	public double radiuss;
	public Centrs punkts;
	
public Aplis(Centrs punkts, double radiuss) {
	this.punkts = punkts;
	this.radiuss = radiuss;
}// Aplis constructor
	
	public double RLGarums() {
		return 2 * Math.PI * radiuss;
	}// RinkaLaukums
	
	public double RLaukums() {
		return Math.PI * Math.pow(radiuss, 2);
	}// RinkaLaukums
	
}
