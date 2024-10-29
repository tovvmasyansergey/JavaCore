package chapters.chapter12.anotation.arrayAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnnotation(str = "hello class",val = 1)
@What(description = "Des method")
public class Meta {
    @MyAnnotation(str = "hello method",val = 2)
    @What(description = "Des method")
    public static void myMethod() throws NoSuchMethodException {
        Meta meta = new Meta();
        Method[] declaredMethods = meta.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("method name is " + declaredMethod.getName());
            Annotation[] annotations = declaredMethod.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof What){
                    System.out.println("our anotation ");
                }
            }
        }


    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMethod();
    }
}
