package homework;

public class Array {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;
            }

        }
        System.out.println("count of 'o'= " + count);

        System.out.println();


        System.out.print(bolola[bolola.length / 2]);
        System.out.print(bolola[bolola.length / 2 - 1]);

        System.out.println();


        if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l') {
            System.out.println(true);
        } else System.out.println(false);


        System.out.println("Bob");

        boolean isfound = false;
        char[] bolola1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bolola1.length - 2; i++) {
            if (bolola1[i] == 'b' && bolola1[i + 2] == 'b') {
                isfound = true;
            }

        }
        System.out.println(isfound);


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


        int index = 0;
        for (int i = startindex; i <= endindex; i++) {
            result[index++]=text[i];
        }
        System.out.println();

        for (int i = 0; i <result.length; i++) {
            System.out.print(result[i]);

        }


    }
}

