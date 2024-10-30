package section6.exercise24;

public class NumberToWords {

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int length = getDigitCount(number);
        int reversedNumber = reverse(number);

        for(int i = 0; i < length; i++) {
            int digit = reversedNumber % 10;
            reversedNumber /= 10;

            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int absNum = Math.abs(number);
        boolean isNegative = absNum != number;
        int reverse = 0;

        for(int i = (int) Math.pow(10, getDigitCount(absNum) - 1); absNum != 0; i /= 10) {
            int digit = absNum % 10;
            absNum /= 10;

            reverse += digit * i;
        }
        return isNegative ? -reverse: reverse;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        return String.valueOf(number).length();
    }
}