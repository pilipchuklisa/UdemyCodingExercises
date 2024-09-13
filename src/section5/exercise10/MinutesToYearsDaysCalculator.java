package section5.exercise10;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / 525_600;
        long days = (minutes % 525_600) / 1440;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
