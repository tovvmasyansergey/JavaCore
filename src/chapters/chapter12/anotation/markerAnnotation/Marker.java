package chapters.chapter12.anotation.markerAnnotation;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth() throws NoSuchMethodException {
        Marker marker = new Marker();
        Method method = marker.getClass().getMethod("myMeth");
        if (method.isAnnotationPresent(MyMarker.class)) {
            System.out.println("Marker annotation ");
        }else {
            System.out.println("method is not found");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }
}
