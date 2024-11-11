package chapters.collection.comparatorAndComparable.anonimComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        studentSet.add(new Student("cc", "cc", 29));
        studentSet.add(new Student("aa", "cc", 20));
        studentSet.add(new Student("mm", "cc", 26));
        System.out.println(studentSet);

    }
}
