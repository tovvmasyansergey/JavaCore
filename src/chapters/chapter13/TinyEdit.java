package chapters.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Please input text");
        System.out.println("Input stop word for exit");
        for (int i = 0; i < 100; i++) {
            str[i] = bw.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println("file");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);

        }
    }
}
