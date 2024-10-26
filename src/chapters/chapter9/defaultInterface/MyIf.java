package chapters.chapter9.defaultInterface;

public interface MyIf {
    int getNumber();
    default String getString(){
        return "object of type of String by default";
    }
}
