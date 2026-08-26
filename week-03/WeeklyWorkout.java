/** Week 3: total a week's completed workout minutes. */
public class WeeklyWorkout {
    public static void main(String[] args) {
        int[] minutes = {30, 45, 25, 40, 50}; int total = 0;
        for (int value : minutes) total += value;
        System.out.println("Weekly workout minutes: " + total);
    }
}
