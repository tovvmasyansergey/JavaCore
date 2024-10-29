package chapters.chapter12.anotation.example1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String str();
    int val();
}
