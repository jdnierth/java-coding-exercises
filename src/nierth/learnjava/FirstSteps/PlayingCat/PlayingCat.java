package nierth.learnjava.FirstSteps.PlayingCat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemperaturLimit = (summer) ? 45 : 35;

        return (temperature >= 25 && temperature <= maxTemperaturLimit);
    }
}
