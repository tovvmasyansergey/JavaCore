package chapters.chapter9.stack;

public class IfTest {
    public static void main(String[] args) {
        FixedStack fixedStack = new FixedStack(5);
        FixedStack fixedStack1 = new FixedStack(8);
        for (int i = 0; i < 7; i++) {
            fixedStack.push(i);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(fixedStack.pop());
        }
    }
}
