package section5;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10_000) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
