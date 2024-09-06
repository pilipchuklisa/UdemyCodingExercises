package section5;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimitTemperature = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimitTemperature;
    }
}
