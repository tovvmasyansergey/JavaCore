package w3resource.exceptions;

import java.io.*;

public class Io {
    public static void main(String[] args){
        try {
            read("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\w3resource\\exceptions\\text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("wrong of read file");
            ;
        }
    }

    public static void read(String path) throws  IOException {
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(path));
        String str = "";
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }
}
