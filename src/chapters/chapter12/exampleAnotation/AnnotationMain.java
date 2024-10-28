package chapters.chapter12.exampleAnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {
    @Example1
    public void myMethod() {
        System.out.println("Hello");
    }

    @Example1
    public void someMethod() {
    }

    @Example1
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationMain annotationMain = new AnnotationMain();
        annotationMain.getClass().getDeclaredMethod("myMethod");
        Method[] declaredMethods = annotationMain.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("method name is:" + declaredMethod.getName());
            Annotation[] annotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Example1) {
                    System.out.println("our Example1 is present");
                }
            }
        }
    }
}