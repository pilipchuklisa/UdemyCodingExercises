package section5.exercise9;

public class AreaCalculator {

    public static double calculateCircleArea(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double calculateRectangleArea(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }
}
