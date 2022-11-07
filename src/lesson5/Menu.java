package lesson5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {

        char choice;
        do {
            System.out.println("Help on: ");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n ");
            System.out.println("Choose one:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");



        switch (choice){
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(condition) statment;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch");
                break;
            case '3':
                System.out.println("The while");
                break;
            case '4':
                System.out.println("The do-while");
                break;
            case '5':
                System.out.println("The for");
                break;

        }















    }
}
