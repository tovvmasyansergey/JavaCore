package homework.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("aaa");
        names.add("bbb");
        names.add("bbb");
        names.add("bbb");
        names.add("bbb");
        System.out.println(checkName(names));
        deleteName(names);
        addName(names);
    }

    private static void addName(ArrayList<String> names) {
        System.out.println("Please input name,index");
        String dataStr = scanner.nextLine();
        try {
            String[] data = dataStr.split(",");
            names.add(Integer.parseInt(data[1]),data[0]);
        }catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Please input right information");
        }
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void deleteName(ArrayList<String> names) {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)){
                names.remove(i);
                break;
            }
        }
        for (String s : names) {
            System.out.println(s);
        }
    }

    private static String checkName(ArrayList<String> names) {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        for (String nameOfList : names) {
            if (name.equals(nameOfList)) {
                return "name is exist";
            }
        }
        return "name is not exist";
    }
}
