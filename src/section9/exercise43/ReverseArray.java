package section9.exercise43;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        for (int i = 0, j = array.length - 1; j > i; i++, j--) {
            var tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
