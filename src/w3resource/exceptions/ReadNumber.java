package w3resource.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadNumber {
    public static void main(String[] args) {
        try {
            read("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\w3resource\\exceptions\\text.txt");
        } catch (IOException e) {
            System.out.println("please input num");
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }

    public static void read(String path) throws IOException, PositiveNumberException,NumberFormatException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String str = "";
        while ((str = bufferedReader.readLine()) != null) {
            int i = Integer.parseInt(str);
            if (i > 0){
                throw new PositiveNumberException("Positive number found: " + i);
            }
        }

    }
}
