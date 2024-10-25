package chapters.chapter9.stack;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack intStack;
        DynStack dynStack = new DynStack(6);
        for (int i = 0; i < 7; i++) {
            dynStack.push(i);
        }
        intStack = dynStack;
        System.out.println(intStack.pop());
    }

}
