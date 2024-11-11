package chapters.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petros");
        names.add("Petros");
        names.add("Petros");
        names.add("Petros");
        for (String name : names) {
            System.out.println(name);
        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}