package chapters.chapter13.file;

import java.io.File;

public class FileExample2 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\textFolder\\bookFolder";
        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\textFolder\\book.txt";
        File directory = new File(directoryPath);
        File file = new File(path);
        System.out.println("file size : " + file.length());
        String[] list = directory.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = directory.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println("name: " + file1.getName() + " size :" + file1.length());
            }
        }
        if (!directory.exists()){
            directory.mkdir();
        }
    }
}
