package nierth.learnjava.SecondsAndMinutesChallenge;

public class SecondsAndMinutesChallenge {

    public static String getDuration(long minutes, long seconds) {

        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        long totalHours = minutes / 60;
        String totalHrs = totalHours < 10 ? "0" + totalHours : Long.toString(totalHours);

        long totalMinutes = minutes % 60;
        String totalMins = totalMinutes < 10 ? "0" + totalMinutes : Long.toString(totalMinutes);

        long totalSeconds = (int) (((minutes * 60) + seconds) % 60);
        String totalSecs = totalSeconds < 10 ? "0" + totalSeconds : Long.toString(totalSeconds);

        return totalHrs + "h " + totalMins + "m " + totalSecs + "s";

    }

    public static String getDuration(long seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDuration(minutes, remainingSeconds);
    }
}
