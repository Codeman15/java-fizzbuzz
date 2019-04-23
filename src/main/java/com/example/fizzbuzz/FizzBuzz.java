package com.example.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int count = 1; count <=15; count++){
            System.out.println(fizzbuzz(count));
        }
    }

    public static String fizzbuzz(int number) {
        if (number % 15 == 0 ) {
            return "FizzBuzz";

        }else if (number % 3 == 0 ) {
            return "Fizz";

        }else if (number % 5 == 0 ) {
            return "Buzz";

        }else {
            return Integer.toString(number);
        }
    }
}
