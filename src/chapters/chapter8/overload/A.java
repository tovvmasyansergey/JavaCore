package chapters.chapter8.overload;

public class A {
    int i, j;
    A(int i,int j){
        this.i = i;
        this.j = j;
    }
    void show(){
        System.out.println(i + " and " + j);
    }
}
