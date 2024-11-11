package chapters.collection.comparatorAndComparable.anonimComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("aa","bb",9));
        studentList.add(new Student("nn","bb",25));
        studentList.add(new Student("hh","bb",21));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        System.out.println(studentList);
    }
}
