package section9.exercise42;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        return new Scanner(System.in).nextInt();
    }

    private static int[] readElements(int length) {
        int[] array = new int[length];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            array[i] = s.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
