package com.cbfacademy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        //try {
        // System.out.println( "Hello World!" );
        //} finally {
        //System.out.println("Hello World");
        //}

        try {
            int result = 10 / 0; // This line will cause an ArithmeticException
            System.out.println("Hello World! Result: " + result);
          } catch (ArithmeticException e) {
            System.out.println("ArithmeticException"); // Informative message in a different language (assuming you want it in Chinese)
          } finally {
            System.out.println("Program execution complete.");
          }
          //question4 - this is a 
          int[] A; 
          A[0] = 0;
    }
}
