package chapters.chapter13.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String directoryPath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\textFolder";
        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\textFolder\\book.txt";
        File file = new File(path);
        System.out.println("file is directory: " + file.isDirectory());
        System.out.println("file is directory: " + file.isFile());
        System.out.println("file is directory: " + file.exists());
        File directory = new File(directoryPath);
        directory.setWritable(false);
        if (directory.canWrite()) {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("file created");
            } else {
                System.out.println("file not created");
            }

        }

    }

}
