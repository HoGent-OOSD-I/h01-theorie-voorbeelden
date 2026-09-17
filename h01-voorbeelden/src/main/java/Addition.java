void main() {
    // Variabelen <1>
    String number1AsText;   // eerste getal als tekst
    int number1; // eerste getal om op te tellen
    int number2; // tweede getal om op te tellen
    int sum; // som van number1 en number2

    // Input
    number1AsText = IO.readln("Enter first integer: "); // <2>
    number1 = Integer.parseInt(number1AsText); // <3>
    number2 = Integer.parseInt(IO.readln("Enter second integer: ")); // <4>

    // Verwerking <5>
    sum = number1 + number2; // de getallen optellen <6>

    // Output
    IO.println(String.format("Sum is %d", sum));    // <7>
}