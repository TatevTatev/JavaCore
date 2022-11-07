package homework;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 16, 3, 15, 4, 7, 8, 9,};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i] + "-ը կրկնվում է");
                    break;
                }


            }


        }

        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                isFound = true;
            }else {
                isFound=false;
                break;
            }

        }
        System.out.println(isFound);


    }
}
