package chapters.chapter14.generick.storage;

public class Storage<T> {
    Object[] objects = new Object[10];
    int size;

    public void add(T obj) {
        if (objects.length == size) {
            extend();
        }
        objects[size++] = obj;
    }

    private void extend() {
        Object[] objects1 = new Object[size + 10];
        System.arraycopy(objects, 0, objects1, 0, size);
    }

    public T getByIndex(int index) {
        return (T) objects[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }
}
