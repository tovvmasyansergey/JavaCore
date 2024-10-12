package chapters.chapter7.example4;

public class Test {
    int a;
    Test(int i){
        a = i;
    }
    Test incrByTen(){
        Test tmp = new Test(a+10);
        return tmp;
    }
}
