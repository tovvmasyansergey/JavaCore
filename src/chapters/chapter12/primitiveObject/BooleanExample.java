package chapters.chapter12.primitiveObject;

public class BooleanExample {
    public static void main(String[] args) {
        // valueOf boolean ---> Boolean
        boolean b = true;
        Boolean b1 = Boolean.valueOf(b);
        // booleanValue Boolean ---> boolean
        Boolean c = false;
        boolean b2 = c.booleanValue();
    }
}
