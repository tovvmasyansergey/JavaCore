package chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        b = (byte) i;
        System.out.println("conversion from int to byte " + b);
        i = (int)d;
        System.out.println("conversion from double to int " + i);
        b = (byte) d;
        System.out.println("conversion from double to byte " + b);
    }
}
