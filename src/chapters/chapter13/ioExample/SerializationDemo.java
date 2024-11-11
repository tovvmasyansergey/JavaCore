package chapters.chapter13.ioExample;

import java.io.*;

public class SerializationDemo {
    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\chapters\\chapter13\\ioExample\\example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //for writing student object to file.

//        Student student = new Student("poxos", "poxosyan", 36, "poxos@gmail.com");
//
//        try (ObjectOutputStream objectOutputStream =
//                     new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
//            objectOutputStream.writeObject(student);
//        }


        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object object = objectInputStream.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }

        }


    }
}
