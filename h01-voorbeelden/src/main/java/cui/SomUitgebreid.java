/* Eerste voorbeeld in Java:
    resultaat tonen van een bewerking
 */ // <1>
                                // <2>
package cui; // <3>
//een project delen we op in packages, voorlopig enkel cui = console-user-interface // <1>

import java.lang.*; // <4>

public class SomUitgebreid extends Object // <5>
{   // <6>
    public static void main(String[] args) {    // <7>
        int x = 2, y = 3, som;  // <8>
        som = x * x + y * y;    // <9>
                                // <2>
        System.out.println("Som = " + som); // <10>
    }   // <11>
}   // <12>
