package chapters.collection.comparatorAndComparable.studentTreeSetComparable;

import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("aa","vv",45));
        studentSet.add(new Student("vv","bb",45));
        studentSet.add(new Student("ff","ss",34));
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
