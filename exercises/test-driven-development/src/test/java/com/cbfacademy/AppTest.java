package com.cbfacademy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
@DisplayName(value = "Basic Test Suite")
public class AppTest {
    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();
        assertThat(app, is(notNullValue()));
    }
    @Test
    @DisplayName("prints Fizz")
    public void testFizz() {
        FizzBuzz FizzBuzz = new FizzBuzz();
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("Fizz", FizzBuzz.get(6));
        assertEquals("Fizz", FizzBuzz.get(9));
        assertEquals("Fizz", FizzBuzz.get(12));
    }
    @Test
    @DisplayName("prints Buzz")
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.get(5));
        assertEquals("Buzz", FizzBuzz.get(10));
    }
    @Test
    @DisplayName("prints FizzBuzz")
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }
}
// assertEquals("Fizz", FizzBuzz.printFizzBuzz(3));
        // assertEquals("Buzz", FizzBuzz.printFizzBuzz(5));
        // assertEquals("FizzBuzz", FizzBuzz.printFizzBuzz(15));