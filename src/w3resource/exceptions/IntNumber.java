package w3resource.exceptions;

import java.io.*;
import java.util.*;

public class IntNumber {
    public static void main(String[] args) {
        try {
            check(addNum());
        } catch (CheckRememb e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Integer> addNum() {
        List<Integer> numb = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if (s.toLowerCase().contains("stop")) {
                flag = false;
                break;
            }
            try {
                int t = Integer.parseInt(s);
                numb.add(t);
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }

        }
        return numb;
    }
    static public void check(List<Integer> numb) throws CheckRememb {
        Set<Integer> integerSet = new HashSet<>();
        for (Integer i : numb) {
            if (integerSet.contains(i)){
                throw new CheckRememb("number is exist");
            }else {
                integerSet.add(i);
            }
        }
    }
}
