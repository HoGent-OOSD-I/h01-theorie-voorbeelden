void main() {
    // Variabelen <1>
    String naam; // <2>

    // Input
    naam = IO.readln("Enter your name: "); // <3>

    // Output
    IO.println(String.format("Welcome to Java Programming %s!", naam));// <4>

}