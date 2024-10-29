package chapters.chapter12.anotation.deafaultAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String str() default "Default string";
    int value() default 20;
}
