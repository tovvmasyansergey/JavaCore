package chapters.chapter8.superExample5;

public class B extends A{
    int i;
    B(int i,int j){
        super.i = i;
        this.i = j;
    }
    void show(){
        System.out.println(super.i);
        System.out.println(i);
    }
}
