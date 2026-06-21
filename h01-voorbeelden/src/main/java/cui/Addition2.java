package cui;

import java.util.Scanner;

public class Addition2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		double number1, number2, sum; // <1>

		System.out.print("Enter first double: "); 
		number1 = input.nextDouble(); // leest eerste getal van de gebruiker <2>

		System.out.print("Enter second double: "); 
		number2 = input.nextDouble(); // leest tweede getal van de gebruiker

		sum = number1 + number2; 

		System.out.printf("Sum is %.2f%n", sum); // de som weergeven <3>

	} 

} 
