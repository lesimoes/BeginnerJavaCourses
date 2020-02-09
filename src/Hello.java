import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

//	Primitive Types
		
		//Only true or false values. 
		boolean isDog = false;

		//The byte data type is an 8-bit signed two's complement integer.
		byte allocMemoryByte = 10;

		//The short data type is a 16-bit signed two's complement integer.
		short shortNumber = 100;
		
		//Integer numbers, like age, numbers of siblings, houses, countable entities.
		int dogAge = 7;
		
		//Long (integer) numbers, like people who living in country, bug species, countable huge entities.	
		long peopleLivingInBrazil = 20000000;
		
		//Decimal numbers.
		float dogWeigth = 8.74f;
		
		//Decimal numbers.
		double dogHeigth = 1.30;
		
		//Char values, like words.
		char firstLetter = 'L';
		
		//Show on console
		System.out.print(isDog + " " + allocMemoryByte + " " + shortNumber 
				+ " " + dogAge + " " + peopleLivingInBrazil 
				+ " " + dogWeigth + " " + dogHeigth + " " + firstLetter);
		
		System.out.println(1 + 2);
		boolean booleanOperation = true && false;
		System.out.println(booleanOperation);
		double heigth = 1.78;
		System.out.println(heigth);
		
		// There is a problem here!!!		
		System.out.println(4 / 3);
		
		System.out.println((double) 4 / 3); //We can solve with cast operator
		
		
		Scanner sr = new Scanner(System.in);
		int valueFromKeyboard = sr.nextInt();
		System.out.print(valueFromKeyboard);

		sr.close();
	}
	

}
