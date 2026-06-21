package cui;

public class FieldWidth {
	public static void main(String args[]) {
		System.out.printf("%4d%n", 1);
		System.out.printf("%4d%n", 12);
		System.out.printf("%4d%n", 123);
		System.out.printf("%4d%n", 1234);
		System.out.printf("%4d%n%n", 12345); // getal is te groot
		System.out.printf("%4d%n", -1);
		System.out.printf("%4d%n", -12);
		System.out.printf("%4d%n", -123);
		System.out.printf("%4d%n", -1234); // getal is te groot
		System.out.printf("%4d%n", -12345); // getal is te groot
	}
}
