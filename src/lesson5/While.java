package lesson5;

public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("thick" + n);
            n--;
        }

        int a = 10, b = 20;
        while (a < b) {
            System.out.println("This will not be displayed");
            a++; b--;
        }


    }
}
