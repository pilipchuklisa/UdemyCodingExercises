package section6.exercise22;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestCommonDivisor = 0;
        int minNum = Math.min(first, second);

        for(int i = 1; i < minNum; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }
}