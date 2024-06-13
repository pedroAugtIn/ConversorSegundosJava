public class SecondsToMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(1293232));
        System.out.println(getDurationString(-13232));
        System.out.println(getDurationString(3599));
        System.out.println(getDurationString(37));
    }

    public static String getDurationString(int seconds) {
        String formatSeconds = "";
        if (seconds < 0) {
            return formatSeconds = "Invalid Time. (" + seconds + ") must be a positive integer value";
        } else if (seconds >= 0 && seconds < 60) {
            return formatSeconds = "00h 00m " + seconds + "s";
        } else if (seconds >= 60 && seconds < 3600) {
            return formatSeconds = "00h " + seconds / 60 + "m " + seconds % 60 + "s";
        } else if (seconds >= 3600) {
            int hours = seconds / 3600;
            int minutes = seconds % 3600 / 60;
            int remainSecs = ((seconds % 3600) % 60);
            return formatSeconds = hours + "h " + minutes + "m " + remainSecs + "s";
        }
        return formatSeconds;
    }
}
