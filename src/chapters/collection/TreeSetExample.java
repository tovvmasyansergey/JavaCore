package chapters.collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> nameSet = new TreeSet<>();
        nameSet.add("Poxos");
        nameSet.add("Poxos");
        nameSet.add("Martiros");
        nameSet.add("Arzuman");
        for (String s : nameSet) {
            System.out.println(s);
        }


    }
}

