package chapters.collection.comparatorAndComparable.studentListComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("aa","bb",21));
        studentList.add(new Student("vv","aa",23));
        studentList.add(new Student("bb","ll",19));
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println(studentList);
    }
}
