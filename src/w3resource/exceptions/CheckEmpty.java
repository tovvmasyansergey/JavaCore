package w3resource.exceptions;

import java.io.*;
import java.util.Scanner;

public class CheckEmpty {
    public static void main(String[] args) {
        try {
            check();
            System.out.println("file is not empty");
        } catch (CheckFileException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void check() throws IOException, CheckFileException {
        try (BufferedReader bw = new BufferedReader(new InputStreamReader(System.in))) {
            File file = new File(bw.readLine());
            if (!file.exists()){
                throw new IOException("file is not exist");
            }
            if (file.length() == 0) {
                throw new CheckFileException("file is empty");
            }
        }
    }
}

