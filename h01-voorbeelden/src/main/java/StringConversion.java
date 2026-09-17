void main() {
    IO.println(String.format("%s", "This is a string" ));   // <1>
    IO.println(String.format("%S", "This is a string" ));   // <2>

    String voorbeeldTekst = "This is also a string";  // <3>

    IO.println(String.format("%s", voorbeeldTekst ));   // <4>
    IO.println(String.format("%S", voorbeeldTekst ));   // <5>
} // end main
