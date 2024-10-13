package chapters.chapter8.example1;

public class A {
    int i , j;
    void showij(){
        System.out.println("i and j" + i + " " + j);
    }
}
class B extends A{
    int k;
    void showK(){
        System.out.println(k);
    }
    void sumIJK(){
        System.out.println(i + j + k);
    }
}