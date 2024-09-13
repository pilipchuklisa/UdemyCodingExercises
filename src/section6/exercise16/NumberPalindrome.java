package section6.exercise16;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        String strNum = String.valueOf(number).replace("-", "");
        String reverseSrtNum = "";

        for (int i = strNum.length() - 1; i >= 0 ; i--) {
            reverseSrtNum += strNum.charAt(i);
        }

        return strNum.equals(reverseSrtNum);
    }
}
