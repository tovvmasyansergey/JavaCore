package homework.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "hello[]((([[[[[ java";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.checker();
    }
}
