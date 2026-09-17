void main() {
    double getal = 125.125;

    IO.println(String.format("%.1f", getal));	// <1>
    IO.println(String.format("%.2f", getal));	// <2>
    IO.println(String.format("%.3f", getal));	// <3>
    IO.println(String.format("%.4f", getal));	// <4>
}