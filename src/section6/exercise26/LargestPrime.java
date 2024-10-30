package section6.exercise26;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int largestPrime = 2;
        while (largestPrime < number) {
            if (number % largestPrime != 0) {
                largestPrime++;
            } else {
                number /= largestPrime;
            }
        }

        return number;
    }
}
