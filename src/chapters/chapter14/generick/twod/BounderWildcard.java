package chapters.chapter14.generick.twod;

public class BounderWildcard {
    static void shoeXY(Coords<?> c) {
        System.out.println("X and Y coordination");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X,Y,Z coordination");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X,Y,Z,T coordination");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }

    }

    public static void main(String[] args) {
        TwoD td[] = {new TwoD(0, 0), new TwoD(3, 4), new TwoD(4, 5), new TwoD(7, 8)};
        Coords<TwoD> tdlocs = new Coords<>(td);
        shoeXY(tdlocs);
        FourD fd[] = {new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)};
        Coords<FourD> fdlocs = new Coords<>(fd);
        shoeXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}


















