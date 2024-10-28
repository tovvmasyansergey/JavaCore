package chapters.chapter10.classwork2;

import java.text.ParseException;

public class ThrowExample {
    static void myMethod(int a) throws MyCustomException {
        if (a == 100) {
            throw new MyCustomException("a is 100");
        }
        System.out.println(a);
    }
    static void myMethod2(int a) throws MyCustomException{
        myMethod(a);
    }

    public static void main(String[] args) {
        try {
            myMethod2(5);
        } catch (MyCustomException e) {
            System.out.println();
        }
        try {
            myMethod(100);
            myMethod(600);

        } catch (MyCustomException e) {
            System.out.println("Number should not be 100");
        }
        System.out.println("Program end");


    }
}
