package section6.exercise25;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        while (bigCount > 0 && goal > 0) {
            bigCount--;

            if (goal - 5 < 0 && smallCount == 0) {
                return false;
            }

            if (goal - 5 >= 0) {
                goal -= 5;
            }
        }

        while (smallCount > 0 && goal > 0) {
            smallCount--;
            goal -= 1;
        }

        return goal == 0;
    }
}