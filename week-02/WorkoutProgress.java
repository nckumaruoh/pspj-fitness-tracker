/** Week 2: calculate progress toward a daily fitness target. */
public class WorkoutProgress {
    public static void main(String[] args) {
        int target = 45, completed = 30;
        int percent = completed * 100 / target;
        System.out.println("Progress: " + percent + "%");
        System.out.println(percent >= 100 ? "Daily goal achieved." : "Minutes remaining: " + (target - completed));
    }
}
