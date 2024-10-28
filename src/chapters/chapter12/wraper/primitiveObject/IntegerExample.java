package chapters.chapter12.wraper.primitiveObject;

public class IntegerExample {
    public static void main(String[] args) {
        // String ---> int
        String m = "23";
        int i = Integer.parseInt(m);
        // int ---> Integer
        int a = 9;
        Integer i1 = Integer.valueOf(a);
        // Integer ---> int
        int i2 = i1.intValue();

    }
}
