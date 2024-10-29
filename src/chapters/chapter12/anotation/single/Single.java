package chapters.chapter12.anotation.single;

import java.lang.reflect.Method;

public class Single {
    @MySingle(value = 100)
    public static void myMeth() throws NoSuchMethodException {
        Single single = new Single();
        Method my = single.getClass().getMethod("myMeth");
        MySingle annotation = my.getAnnotation(MySingle.class);
        System.out.println(annotation.value());

    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }
}
