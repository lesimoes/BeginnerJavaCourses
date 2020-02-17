package exerc01_resp;

public class Triangulo {

	double sideA, sideB, sideC, p;
	
	public double calcularArea() {
		return Math.sqrt(
				this.p * (this.p - this.sideA) * (this.p - this.sideB) * (this.p - this.sideC)
				);
		
	}
	
	public double calcularSemiPerimetro() {
		return (this.sideA * this.sideB * this.sideC) / 2;
	}
}
