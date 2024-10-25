package chapters.chapter9.stack;

public class IfTest2 {
    public static void main(String[] args) {
        DynStack dynStack = new DynStack(5);
        for (int i = 0; i < 7; i++) {
            dynStack.push(i);
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(dynStack.pop());
        }
    }
}
