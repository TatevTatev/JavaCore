package homework.braceChecker;

public class BraceChecker {
    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            char pop;
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = (char) stack.pop();
                    if (pop != '(') {
                        System.err.print(" Error : Closed " + c + "but  opended " + pop + "at " + i);
                    }
                    break;
                case '}':
                    pop = (char) stack.pop();
                    if (pop != '{') {
                        System.err.print(" Error : Closed " + c + "but  opended " + pop + "at " + i);
                    }
                    break;
                case ']':
                    pop = (char) stack.pop();
                    if (pop != '[') {
                        System.err.print(" Error : Closed " + c + "but  opended " + pop + "at " + i);
                    }
                    break;


            }
        }
    }


}
