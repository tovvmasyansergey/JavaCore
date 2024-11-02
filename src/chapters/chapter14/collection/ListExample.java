package chapters.chapter14.collection;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petros");
        names.add("Petros");
        names.add("Petros");
        names.add("Petros");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (String name : names) {
            System.out.println(name);
        }


    }
}
