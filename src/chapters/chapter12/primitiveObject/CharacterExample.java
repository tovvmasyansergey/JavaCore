package chapters.chapter12.primitiveObject;

public class CharacterExample {
    public static void main(String[] args) {
        // valueOf char ---> character
        char c = 'l';
        Character character1 = Character.valueOf(c);
        // charValue character ---> char
        Character n = 'r';
        char c1 = n.charValue();
    }
}
