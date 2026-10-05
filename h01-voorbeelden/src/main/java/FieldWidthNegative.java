void main() {
    IO.print(String.format("%-6d", 1)); // <1>
    IO.println(String.format("%-6d", 12));

    IO.print(String.format("%-6d", 123));
    IO.println(String.format("%-6d", 1234));

    IO.print(String.format("%-6d", 12345));
    IO.println(String.format("%-6d%n", 1234567)); // getal is te groot
}