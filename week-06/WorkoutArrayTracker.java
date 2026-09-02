/** Week 6: store, search and analyse workout data with parallel arrays. */
public class WorkoutArrayTracker {
    static int indexOf(String[] days, String requiredDay) {
        for (int index = 0; index < days.length; index++) {
            if (days[index].equalsIgnoreCase(requiredDay)) return index;
        }
        return -1;
    }

    static int mostActiveDayIndex(int[] minutes) {
        int best = 0;
        for (int index = 1; index < minutes.length; index++) {
            if (minutes[index] > minutes[best]) best = index;
        }
        return best;
    }

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int[] minutes = {30, 45, 25, 40, 50};
        int total = 0;
        for (int value : minutes) total += value;

        int mostActive = mostActiveDayIndex(minutes);
        int wednesday = indexOf(days, "Wednesday");
        System.out.println("Weekly total: " + total + " minutes");
        System.out.println("Most active day: " + days[mostActive] + " (" + minutes[mostActive] + " minutes)");
        System.out.println("Search 'Wednesday': " + minutes[wednesday] + " minutes");
    }
}
