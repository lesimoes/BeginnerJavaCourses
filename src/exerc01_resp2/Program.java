package exerc01_resp2;

import java.util.Scanner;

import exerc01_resp2.Triangulo;;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com as medidas do primeiro triangulo: ");
		
		Triangulo trianguloX = new Triangulo(
				scan.nextDouble(), 
				scan.nextDouble(), 
				scan.nextDouble()
				);
		
		System.out.print("Entre com as medidas do primeiro triangulo: ");
		
		Triangulo trianguloY = new Triangulo(
				scan.nextDouble(), 
				scan.nextDouble(), 
				scan.nextDouble()
				);


		scan.close();
		
		System.out.println("A área do triangulo X: " + trianguloX.getArea());
		System.out.println("A área do triangulo Y: " + trianguloY.getArea());
		int comparaTrianguloX = trianguloX.getLargerArea(trianguloY);
		String resultMsg = "São Iguais";
		
		if (comparaTrianguloX == 1) resultMsg = "Triangulo X";
		if (comparaTrianguloX == -1) resultMsg = "Triangulo X";
		
		System.out.println("O Maior triangulo é: " + resultMsg);

		
	}
	

}
