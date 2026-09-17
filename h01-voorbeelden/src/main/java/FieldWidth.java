void main() {
    IO.println(String.format("%4d", 1));
    IO.println(String.format("%4d", 12));
    IO.println(String.format("%4d", 123));
    IO.println(String.format("%4d", 1234));
    IO.println(String.format("%4d%n", 12345)); // getal is te groot

    IO.println(String.format("%4d", -1)); // <1>
    IO.println(String.format("%4d", -12));
    IO.println(String.format("%4d", -123));
    IO.println(String.format("%4d", -1234)); // getal is te groot
    IO.println(String.format("%4d", -12345)); // getal is te groot
}