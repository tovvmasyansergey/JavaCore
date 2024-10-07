package classwork.stringMethods;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Poxos Poxosyan";
        char c = name.charAt(0);
        System.out.println(c);
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        char[] charArray = name.toCharArray();
        for (char c1 : charArray) {
            System.out.println(c1);
        }
    }
}
