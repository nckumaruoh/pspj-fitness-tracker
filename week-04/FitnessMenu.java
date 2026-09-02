/** Week 4: a loop-driven, menu-style workout recording session. */
public class FitnessMenu {
    public static void main(String[] args) {
        String[] activities = {"Cardio", "Strength"};
        int[] minutes = {35, 20};
        int dailyGoal = 45;
        int session = 0;

        System.out.println("=== Fitness Tracker Menu ===");
        System.out.println("1. Record workout");
        System.out.println("2. Review daily goal");
        System.out.println("3. Exit");

        while (session < activities.length) {
            System.out.println("Recorded: " + activities[session] + " (" + minutes[session] + " minutes)");
            if (minutes[session] >= dailyGoal) {
                System.out.println("Goal status: daily goal achieved.");
            } else {
                System.out.println("Goal status: " + (dailyGoal - minutes[session]) + " minutes remaining.");
            }
            session++;
        }
        System.out.println("Sessions processed: " + session);
    }
}
