package cui;

import java.util.Scanner; // <1>

public class Addition {
	// main methode start de uitvoering van Java applicatie
	public static void main(String[] args) {
		// creëer een object van Scanner; voor invoer vanaf het toetsenbord
		Scanner input = new Scanner(System.in); // <2>

		int number1; // eerste getal om op te tellen <3>
		int number2; // tweede getal om op te tellen
		int sum; // som van number1 en number2

		System.out.print("Enter first integer: "); // prompt <4>
		number1 = input.nextInt(); // leest eerste getal van de gebruiker <5>

		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // leest tweede getal van de gebruiker

		sum = number1 + number2; // de getallen optellen <6>

		System.out.printf("Sum is %d%n", sum); // de som weergeven <7>

	} // einde methode main

} // einde klasse Addition
