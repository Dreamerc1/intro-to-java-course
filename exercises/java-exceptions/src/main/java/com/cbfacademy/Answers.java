package com.cbfacademy;

public class Answers {
   // Question 1 - Is the following code legal? yes! because it compiles
    try {

    } finally {
    
    }
    /* question 2 - What exception types can be caught by the following handler?
     * What is wrong with using this type of exception handler?
     */
    catch (Exception e) {
    
    }
    // this is a general Exception class. drawbacks include not specific enough

    // Question 3 - Is there anything wrong with the following exception handler as written? Will this code compile?
    //This code will compile however exclude the generic exception to be more specific.
    try {

    } catch (Exception e) {
    
    } catch (ArithmeticException a) {
    
    }


}
