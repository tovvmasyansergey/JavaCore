package chapters.chapter14.generick.storage;

public class StorageDemo {
    public static void main(String[] args) {
        Storage<Student> studentStorage = new Storage<>();
        studentStorage.add(new Student());
        Student byIndex = studentStorage.getByIndex(0);
        System.out.println(byIndex.getName());
        studentStorage.print();

        Storage<Student> studentStorage1 = new Storage<>();
        studentStorage1.add(new Student());

        Storage<Book> bookStorage = new Storage<>();
        bookStorage.print();

        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("poxos");

        Storage<Integer> integerStorage = new Storage<>();






    }
}
