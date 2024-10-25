package chapters.chapter9.nestInterface;

public class B implements A.NestedIF{

    @Override
    public boolean isNotNegative(int c) {
        return c < 0 ? false : true;
    }
}
