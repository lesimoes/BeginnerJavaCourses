package exerc01_resp2;

public class Triangulo {

	double sideA, sideB, sideC;
	
	
	public Triangulo(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getArea() {
		double semiPerimetro = this.getSemiPerimetro();
		return Math.sqrt(
				semiPerimetro * 
				(semiPerimetro - this.sideA) * 
				(semiPerimetro - this.sideB) * 
				(semiPerimetro - this.sideC)
				);
	}
	
	public double getSemiPerimetro() {
		return (this.sideA * this.sideB * this.sideC) / 2;
	}
	
	public int getLargerArea(Triangulo trianguloB) {
		if (this.getArea() > trianguloB.getArea()) {
			return 1;
		}
		if (this.getArea() < trianguloB.getArea()) {
			return -1;
		}
		return 0;
	}
}
