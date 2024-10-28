package chapters.chapter10.classwrok3;

import chapters.chapter10.classwork1.MyCustomException;

import java.text.ParseException;

public class ThrowExample {
    static void myMethod(int a) throws ParseException {
        if (a == 100) {
            throw new ParseException("", 4);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        try {
            myMethod(100);
            myMethod(600);

        } catch (ParseException e) {
            System.out.println("Number should not be 100");
        }
        System.out.println("Program end");


    }
}
