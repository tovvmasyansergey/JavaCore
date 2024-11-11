package homework.collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> name = new TreeSet<String>();
        name.add("WW");
        name.add("vv");
        name.add("dd");
        name.add("ff");
        name.add("dd");
        name.add("dd");
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println(name);
    }
}
