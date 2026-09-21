void main() {
    int getal1 = 10;
    int getal2 = 20;
    double getal3 = 363.3636;

    IO.print(String.format("%30s\t", "getal1 + getal2"));
    IO.println(String.format("%4d", getal1 + getal2));
    IO.println(String.format("%d\t%f%n%3S", getal1 - getal2, getal3, "einde"));
    IO.println(String.format("%1d", 100 - getal2 * 10));
    IO.println(String.format("\t%.3f", getal3));
}
