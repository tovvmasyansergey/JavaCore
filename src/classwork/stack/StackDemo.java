package classwork.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
//        System.out.println(stack.tos);
//        for (int i = 0; i < 11; i++) {
//            stack.push(i);
//        }
//        stack.push(3);
//        for (int i = 0; i < 13; i++) {
//            System.out.println(stack.pop());
//        }
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.pop());
    }
}
