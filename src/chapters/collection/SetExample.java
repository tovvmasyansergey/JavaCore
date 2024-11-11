package chapters.collection;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("Poxos");
        nameSet.add("Poxos");
        nameSet.add("Martiros");
        nameSet.add("Arzuman");
        for (String s : nameSet) {
            System.out.println(s);
        }
    }
}
