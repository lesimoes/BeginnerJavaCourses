import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		//Inputs from keyboard	- Open
		Scanner scan = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		System.out.print("Entre com as medidas do primeiro triangulo: ");
		xA = scan.nextDouble();
		xB = scan.nextDouble();
		xC = scan.nextDouble();
		
		System.out.print("Entre com as medidas do segundo triangulo: ");
		yA = scan.nextDouble();
		yB = scan.nextDouble();
		yC = scan.nextDouble();
		
		double p = (xA * xB * xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA * yB * yC);
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		if (areaX > areaY) {
			System.out.print("A maior área é do triangulo X");
		} else {
			System.out.print("A maior área é do triangulo Y");
		}
		
		//Inputs form keyboard - Close
		scan.close();
	}

}
