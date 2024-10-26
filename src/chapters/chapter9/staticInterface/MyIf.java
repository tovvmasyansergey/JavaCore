package chapters.chapter9.staticInterface;
public interface MyIf {
    int getNumber();
    default String getString(){
        return "object type of String by default";
    }
    static int getDefaultNumber(){
        return 0;
    }
}
