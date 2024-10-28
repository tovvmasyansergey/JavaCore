package chapters.chapter10.myException;


import java.text.ParseException;

public class ThrowExample {
    static void myMethod(int a) throws MyCustomException {
        if (a == 100) {
            throw new MyCustomException("a is 100");
        }
        if (a == 200) {
            throw new MyCustomException("a is 200");
        }

        System.out.println(a);
    }

    static void myMethod2(int a) throws MyCustomException {
        myMethod(a);
    }

    public static void main(String[] args) {
        int num = 200;
        try {
            myMethod2(num);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Program end");


    }

}
