package chapters.collection.comparatorAndComparable.studentTreeSetComparator;

import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>(new StudentAgeComparator());
        studentSet.add(new Student("aa","bb",12));
        studentSet.add(new Student("ff","ll",32));
        studentSet.add(new Student("bb","bb",22));
        System.out.println(studentSet);
    }
}
