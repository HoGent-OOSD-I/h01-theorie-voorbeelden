package cui;

public class StringConversion 
{
   public static void main( String args[] )
   { 
      System.out.printf( "%s%n", "This is a string" );   // <1>
      System.out.printf( "%S%n", "This is a string" );   // <2>

      String string = "This is also a string";  // <3>
      
      System.out.printf( "%s%n", string );   // <4>
      System.out.printf( "%S%n", string );   // <5>
   } // end main 
} // end class StringConversion

