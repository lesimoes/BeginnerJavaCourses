import java.util.Scanner;

public class HelloStrings {

	public static void main(String[] args) {

		//Sequence of characters
		String fullText = "Eu adoro programar em Java!";
		System.out.println(fullText + "is a" + fullText.getClass());
		
		//Some methods
		System.out.println(fullText.length());
		System.out.println(fullText.substring(3, 8));
		System.out.println(fullText.contains("adoro"));
		System.out.println(fullText.contains("adoros"));
		System.out.println(fullText.toUpperCase());
		System.out.println(fullText.toLowerCase());
		
		//We have a "problem" here!
		fullText.concat("Muito mesmo!");
		System.out.println(fullText);
		
		String newFullText = fullText.concat(" Muito mesmo!");
		System.out.println(newFullText);
		
		
		String firstName = "Winglerson";
		String anotherFirstName = "winglerson";
		
		System.out.println(firstName.equals(anotherFirstName));
		System.out.println(firstName.equalsIgnoreCase(anotherFirstName));


	}
	

}
