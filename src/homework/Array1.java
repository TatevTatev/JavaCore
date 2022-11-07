package homework;

public class Array1 {
    public static void main(String[] args) {
        int[] array = {12, 15, 14, 18, 65, 64, 59, 84, 12, 54};
        int n = 15;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
            }

        }
        System.out.println(index);


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        int startindex = 0;
        int endindex = text.length - 1;

        while (startindex < endindex && text[startindex] == ' ') {
            startindex++;
        }

        while (startindex < endindex && text[endindex] == ' ') {
            endindex--;
        }


        for (int i = startindex; i <= endindex; i++) {
            System.out.print(text[i]);
        }

        char[] result = new char[(endindex - startindex) + 1];


        int index1 = 0;
        for (int i = startindex; i <= endindex; i++) {
            result[index1++] = text[i];

        }

        for (char c : result) {
            System.out.print(c);
        }
    }
}
