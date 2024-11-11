package chapters.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BFReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Please input text");
        System.out.println("For exit input stop");
        do {
            line = bf.readLine();
            System.out.println(line);
        }while (!line.equals("stop"));
    }
}
