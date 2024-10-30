package section6.exercise28;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avarege = 0L;
        int count = 0;
        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                String str = s.next();
                int number = Integer.parseInt(str);
                sum += number;
                count++;
                avarege = Math.round((float) sum / count);
            } catch (Exception e) {
                System.out.println("SUM = " + sum + " AVG = " + avarege);
                break;
            }
        }
    }
}


