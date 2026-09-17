void main() {
    // Variabelen
    double number1, number2, sum; // <1>

    // Input
    number1 = Double.parseDouble(IO.readln("Enter first integer: ")); // <2>
    number2 = Double.parseDouble(IO.readln("Enter second integer: "));

    // Verwerking
    sum = number1 + number2;

    // Output
    IO.println(String.format("Sum is %.2f", sum));  // <3>
}