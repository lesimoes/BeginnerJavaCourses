package exerc01_resp;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Triangulo trianguloX = new Triangulo();
		
		System.out.print("Entre com as medidas do primeiro triangulo: ");
		trianguloX.sideA = scan.nextDouble();
		trianguloX.sideB = scan.nextDouble();
		trianguloX.sideC = scan.nextDouble();
		
		
		Triangulo trianguloY = new Triangulo();
		
		System.out.print("Entre com as medidas do segundo triangulo: ");
		trianguloY.sideA = scan.nextDouble();
		trianguloY.sideB = scan.nextDouble();
		trianguloY.sideC = scan.nextDouble();
		
		trianguloX.p =  trianguloX.calcularSemiPerimetro();
		trianguloY.p = trianguloY.calcularSemiPerimetro();
		
		System.out.print("A área do triangulo X: " + trianguloX.calcularArea());
		System.out.print("A área do triangulo Y: " + trianguloY.calcularArea());

		
		if (trianguloX.calcularArea() > trianguloY.calcularArea()) {
			System.out.print("A maior área é do triangulo X");
		}
		if (trianguloX.calcularArea() < trianguloY.calcularArea()) {
			System.out.print("A maior área é do triangulo Y");
		}
		if (trianguloX.calcularArea() == trianguloY.calcularArea()) {
			System.out.print("A área dos triangulos são iguais");
		}
		
		
	}

}
