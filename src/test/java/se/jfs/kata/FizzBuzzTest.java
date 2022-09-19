package se.jfs.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzForThree() {
        String result = fizzBuzz.getOutput(3);
        assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnBuzzForFive() {
        String result = fizzBuzz.getOutput(5);
        assertEquals("Buzz", result);
    }

    @Test
    void shouldReturnFizzBuzzForFifteen() {
        String result = fizzBuzz.getOutput(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturn2For2() {
        String result = fizzBuzz.getOutput(2);
        assertEquals("2", result);
    }

    @Test
    void shouldReturnErrorMessageForNegativeNumber() {
        String result = fizzBuzz.getOutput(-4);
        assertEquals("-4 ... Please provide a positive number. Try again", result);
    }

    @Test
    void shouldReturnErrorMessageForNumberOver100() {
        String result = fizzBuzz.getOutput(101);
        assertEquals("101 ... Please provide a number below 100", result);
    }

}