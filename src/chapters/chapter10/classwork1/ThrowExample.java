package chapters.chapter10.classwork1;

import java.text.ParseException;

public class ThrowExample {
    static void myMethod(int a){
        if (a == 100){
            throw new MyCustomException();
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        myMethod(600);
    }
}
