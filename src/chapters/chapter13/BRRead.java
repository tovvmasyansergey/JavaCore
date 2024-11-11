package chapters.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input simbols,'q' for exit");
        do {
            c = (char) bw.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
