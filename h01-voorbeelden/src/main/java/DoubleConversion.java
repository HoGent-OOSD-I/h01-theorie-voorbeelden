void main() {
    IO.println(String.format("%f", 2.5));		// <1>
    IO.println(String.format("%f", 25.25));	// <1>

    double getal = 2.5;					// <2>

    IO.println(String.format("%n%f", getal)); // <3>
}