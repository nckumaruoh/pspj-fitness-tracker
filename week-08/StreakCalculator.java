/** Week 8: use recursion to find the longest consecutive goal-achievement streak. */
public class StreakCalculator {
    static int longestGoalStreak(int[] minutes, int goal, int index, int current, int best) {
        if (index == minutes.length) return best;
        int nextCurrent = minutes[index] >= goal ? current + 1 : 0;
        int nextBest = Math.max(best, nextCurrent);
        return longestGoalStreak(minutes, goal, index + 1, nextCurrent, nextBest);
    }

    public static void main(String[] args) {
        int[] minutes = {35, 45, 30, 10, 40, 55, 25};
        int goal = 30;
        int streak = longestGoalStreak(minutes, goal, 0, 0, 0);
        System.out.println("Daily goal: " + goal + " minutes");
        System.out.println("Longest goal streak: " + streak + " days");
    }
}
