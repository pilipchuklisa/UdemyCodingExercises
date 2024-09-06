package section6;

public class SharedDigit {

    public static boolean hasSharedDigit(int p1, int p2) {
        if (p1 >= 10 && p1 <= 99 && p2 >= 10 && p2 <= 99) {
            String strP1 = String.valueOf(p1);
            String strP2 = String.valueOf(p2);

            for (int i = 0; i < strP1.length(); i++) {
                for (int j = 0; j < strP2.length(); j++) {
                    if (strP1.charAt(i) == strP2.charAt(j)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
