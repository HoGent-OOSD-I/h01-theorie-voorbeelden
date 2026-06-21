package cui;

public class Precision {
	public static void main(String[] args) {
		double getal = 125.125;

		System.out.printf("%.1f%n", getal);	// <1>
		System.out.printf("%.2f%n", getal);	// <2>
		System.out.printf("%.3f%n", getal);	// <3>
		System.out.printf("%.4f%n", getal);	// <4>
	}

}
