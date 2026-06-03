package cui;
//een project delen we op in packages, voorlopig enkel cui = console-user-interface

import java.lang.*;
//mag weggelaten worden, want wordt als enige package uit de Java-API automatisch geïmporteerd

public class Som extends Object
// extends Object mag ook weggelaten worden gezien ELKE klasse in Java erft van Object, de moederklasse
{
	public static void main(String[] args)
	{
		int x = 2, y = 3, som;
		som = x * x + y * y;
		System.out.println("Som = " + som);
	}
}
