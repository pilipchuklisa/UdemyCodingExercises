package section5.exercise8;

public class TeenNumberChecker {

    public static boolean hasTeen (int p1, int p2, int p3) {
        return isTeen(p1) || isTeen(p2) || isTeen(p3);
    }

    public static boolean isTeen (int p1) {
        return p1 > 12 && p1 < 20;
    }
}
