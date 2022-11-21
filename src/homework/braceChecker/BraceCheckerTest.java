package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text="(Hello) Java), hello (World]";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }

}
