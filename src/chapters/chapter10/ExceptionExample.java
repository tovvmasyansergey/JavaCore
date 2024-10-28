package chapters.chapter10;

import java.util.EmptyStackException;

public class ExceptionExample {
    public static void main(String[] args) {
        int d = 0;
        try {
            int a = 42 / d;
        }catch (ArithmeticException e){
            System.out.println("/ by 0 in not allowed");
        }
        System.out.println("hello");
    }
}
