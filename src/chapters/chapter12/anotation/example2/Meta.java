package chapters.chapter12.anotation.example2;

import java.lang.reflect.Method;

public class Meta {
    @MyAnnotation(str = "hello", val = 10)
    public static void myMethod() throws NoSuchMethodException {
        Meta meta = new Meta();
        Method my = meta.getClass().getMethod("myMethod");
        MyAnnotation annotation = my.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.str() + " " + annotation.val());



    }

    public static void main(String[] args) throws NoSuchMethodException {
        Meta.myMethod();
    }
}
