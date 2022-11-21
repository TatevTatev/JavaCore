package lesson6.scanner;

import lesson6.calc.Calculator;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isRun = true;
        do {
            System.out.println("Please input a number");
            int number1 = scanner.nextInt();
            System.out.println("Please input next  number");
            int number2 = scanner.nextInt();
            System.out.println("Please input an arithmetic operation");
            String operation = scanner.next();
            switch (operation) {
                case "+":
                    System.out.println(calculator.plus(number1, number2));
                    break;
                case "-":
                    System.out.println(calculator.minus(number1, number2));
                    break;
                case "*":
                    System.out.println(calculator.multiply(number1, number2));
                    break;
                case "/":
                    System.out.println(calculator.divide(number1, number2));
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        } while (isRun = true);


    }
}
