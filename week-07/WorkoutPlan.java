/** Week 7: modularise the tracker and exercise normal and edge-case plans. */
public class WorkoutPlan {
    private final String member;
    private final int weeklyGoal;
    private int sessionsCompleted;
    private int minutesRecorded;

    WorkoutPlan(String member, int weeklyGoal) {
        this.member = member;
        this.weeklyGoal = weeklyGoal;
    }

    void addSession(int minutes) {
        if (minutes <= 0) {
            System.out.println("Ignored invalid session: " + minutes + " minutes");
            return;
        }
        sessionsCompleted++;
        minutesRecorded += minutes;
    }

    int remainingMinutes() {
        return Math.max(0, weeklyGoal - minutesRecorded);
    }

    void printSummary() {
        System.out.println("Plan: " + member + "'s starter plan");
        System.out.println("Sessions completed: " + sessionsCompleted);
        System.out.println("Minutes recorded: " + minutesRecorded);
        System.out.println("Goal remaining: " + remainingMinutes());
    }

    public static void main(String[] args) {
        WorkoutPlan plan = new WorkoutPlan("Asha", 150);
        plan.addSession(30);
        plan.addSession(45);
        plan.addSession(25);
        plan.addSession(0); // Edge case: must not change the plan.
        plan.printSummary();
    }
}
