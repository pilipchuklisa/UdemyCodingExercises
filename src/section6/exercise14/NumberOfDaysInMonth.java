package section6.exercise14;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10_000) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth (int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                }
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
}
