package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 77};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];
            }

        }
        System.out.println("biggest = " + biggest);

        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }

        }
        System.out.println("smallest = " + smallest);


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("evens are " + array[i]);
            }

        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("odds are " + array[i]);
            }

        }


        int numberOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numberOfEvens++;


            }

        }
        System.out.println("numberOfEvens = " + numberOfEvens);


        int numberOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                numberOfOdds++;


            }

        }
        System.out.println("numberOfOdds = " + numberOfOdds);


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum=array[i]+sum;

        }
        System.out.println(sum);


        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average=array[i]+average;

        }
        System.out.println(average/array.length);


    }
}
