package w3resource.exceptions;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Example2 {
    public static void main(String[] args) {
        try {
            check(4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void check(int a){
        if (a % 2 == 0){
            throw new IllegalArgumentException("number is odd");
        }
    }
}
