package homework;

public class SortingArray {
    public static void main(String[] args) {
        int[] array = {12, 10, 14, 18, 65, 64, 59, 84, 54};


        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }


            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }


    }
}
