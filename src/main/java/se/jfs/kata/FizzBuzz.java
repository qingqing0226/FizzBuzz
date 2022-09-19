package se.jfs.kata;

public class FizzBuzz {


    public String getOutput(int i) {
        if (i < 0) {
            return i + " ... Please provide a positive number. Try again";
        }
        if (i > 100) {
            return i + " ... Please provide a number below 100";
        }
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return i + "";
    }
}
