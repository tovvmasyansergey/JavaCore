package chapters.chapter12.anotation.deafaultAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Meta {
    @MyAnnotation()
    public static void myMeth(){
        Meta meta = new Meta();
        Method[] declaredMethods = meta.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println(declaredAnnotation);
            }

        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
