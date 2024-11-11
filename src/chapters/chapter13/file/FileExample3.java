package chapters.chapter13.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\textFolder\\java.txt";
        System.out.println(System.getProperty("user.dir"));
        File file = new File(path);
        System.out.println(file.isFile());
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
        System.out.println(File.separator);
        System.out.println(file.createNewFile());
        file.delete();

    }
}
