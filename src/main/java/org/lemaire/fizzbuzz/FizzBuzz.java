package main.java.org.lemaire.fizzbuzz;

public class FizzBuzz {

    public void printFizzBuzz() {
        for(int i = 1; i <= 100; i++){
            String result = "";
            result += divisibleBy3(i) ? "Fizz" : "";
            result += divisibleBy5(i) ? "Buzz" : "";
            System.out.println(!result.isEmpty() ? result : i);
        }
    }

    private boolean divisibleBy3(int number) {
        return number % 3 == 0;
    }

    private boolean divisibleBy5(int number) {
        return number % 5 == 0;
    }
}
