package cui;

public class Oefening3
{

	public static void main(String[] args)
	{
		int getal1 = 10;
		int getal2 = 20;
		double getal3 = 363.3636;

		System.out.printf("%30s\t", "getal1 + getal2");
		System.out.printf("%4d%n", getal1 + getal2);
		System.out.printf("%d\t%f%n%3S%n", getal1 - getal2, getal3, "einde");
		System.out.printf("%1d%n", 100 - getal2 * 10);
		System.out.printf("\t%.3f", getal3);

	}

}
