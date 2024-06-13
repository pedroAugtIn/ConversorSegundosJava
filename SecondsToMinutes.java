public class SecondsToMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(1293232));
    }

    public static String getDurationString(int seconds) {
        String formatSeconds = "";
        if (seconds < 0) {
            return formatSeconds = "Invalid Time.";
        } else if (seconds >= 0 && seconds < 60) {
            formatSeconds = "00h 00m " + seconds + "s";
            return formatSeconds;
        } else if (seconds >= 60 && seconds < 3600) {
            formatSeconds = "00h " + seconds / 60 + "m " + seconds % 60 + "s";
            return formatSeconds;
        } else if (seconds >= 3600) {
            int hours = seconds / 3600;
            int minutes = seconds % 3600 / 60;
            int remainSecs = ((seconds % 3600) % 60);
            return formatSeconds = hours + "h " + minutes + "m " + remainSecs + "s";
        }
        return formatSeconds;
    }
}
