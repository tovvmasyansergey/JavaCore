package chapters.chapter12.anotation.example1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Meta {
    @MyAnnotation(str = "example of annotation", val = 100)
    public static void myMeth() {
        Meta meta = new Meta();
        Method[] declaredMethod = meta.getClass().getDeclaredMethods();
        for (Method method : declaredMethod) {
            System.out.println("method name is " + method.getName());
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof MyAnnotation){
                    System.out.println("our MyAnnotation");
                }
            }
        }


    }
@MyAnnotation(str = "hello",val = 100)
    public static void main(String[] args) {
        Meta.myMeth();
        Meta meta = new Meta();
    }
}

