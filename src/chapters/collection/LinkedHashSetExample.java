package chapters.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> nameSet = new LinkedHashSet<>();
        nameSet.add("Poxos");
        nameSet.add("Poxos");
        nameSet.add("Martiros");
        nameSet.add("Arzuman");
        for (String s : nameSet) {
            System.out.println(s);
        }
    }
}
