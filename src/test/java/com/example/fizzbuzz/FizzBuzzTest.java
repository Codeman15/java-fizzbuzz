package com.example.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void givesFizz() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    public void givesBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    public void givesFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }
}