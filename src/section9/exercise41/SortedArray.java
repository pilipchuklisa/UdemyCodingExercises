package section9.exercise41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int length) {

        int[] array = new int[length];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < length; i++) {
            array[i] = s.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        var sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        var reversedSortedArray = new int[sortedArray.length];
        for (int i = sortedArray.length - 1, j = 0;
             i >= 0 || j < reversedSortedArray.length;
             i--, j++) {
            reversedSortedArray[j] = sortedArray[i];
        }
        return reversedSortedArray;
    }
}
