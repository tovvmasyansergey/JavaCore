package chapters.collection.comparatorAndComparable.studentListComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class studentList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("ll","aa",23));
        studentList.add(new Student("cc","cc",28));
        studentList.add(new Student("bb","bb",25));
        Collections.sort(studentList,new StudentAgeComparator());
        System.out.println(studentList);
        Collections.sort(studentList,new StudentNameComparator());
        System.out.println(studentList);
    }
}
