/** Week 5: extract reusable calculations into clear methods. */
public class WorkoutService {
    static int weeklyTotal(int[] minutes) {
        int total = 0;
        for (int value : minutes) total += value;
        return total;
    }

    static int caloriesEstimate(int minutes) {
        return minutes * 6;
    }

    static String goalStatus(int completed, int target) {
        return completed >= target ? "Goal achieved" : (target - completed) + " minutes remaining";
    }

    public static void main(String[] args) {
        int[] minutes = {30, 45, 25, 40, 50};
        int total = weeklyTotal(minutes);
        System.out.println("Member: Asha");
        System.out.println("Week total: " + total + " minutes");
        System.out.println("Calories estimate: " + caloriesEstimate(total) + " kcal");
        System.out.println("Status: " + goalStatus(total, 150));
    }
}
