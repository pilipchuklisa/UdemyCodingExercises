package section6.exercise20;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int p1, int p2, int p3) {
        return isValid(p1) && isValid(p2) && isValid(p3) &&
                ((p1 % 10 == p2 % 10) || (p1 % 10 == p3 % 10) || (p2 % 10 == p3 % 10));
    }

    public static boolean isValid(int p1) {
        return p1 >= 10 && p1 <= 1000;
    }
}
