package section6.exercise17;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        String strNum = String.valueOf(number);

        int firstDigit = Character.getNumericValue(strNum.charAt(0));
        int lastDigit = Character.getNumericValue(strNum.charAt(strNum.length() - 1));

        return firstDigit + lastDigit;
    }
}
