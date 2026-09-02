import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** Week 12: complete the tracker with collection-based and streams-based analytics. */
public class FitnessAnalytics {
    static class WorkoutSession {
        private final String member;
        private final int minutes;

        WorkoutSession(String member, int minutes) {
            this.member = member;
            this.minutes = minutes;
        }

        String member() { return member; }
        int minutes() { return minutes; }
    }

    public static void main(String[] args) {
        List<WorkoutSession> sessions = List.of(
            new WorkoutSession("Asha", 45),
            new WorkoutSession("Asha", 50),
            new WorkoutSession("Ravi", 60),
            new WorkoutSession("Ravi", 50),
            new WorkoutSession("Meera", 60)
        );

        Map<String, Integer> totals = sessions.stream().collect(Collectors.groupingBy(
            WorkoutSession::member,
            Collectors.summingInt(WorkoutSession::minutes)
        ));
        String topMember = totals.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("No member");
        int topMinutes = totals.getOrDefault(topMember, 0);
        String goalAchievers = totals.entrySet().stream()
            .filter(entry -> entry.getValue() >= 90)
            .map(Map.Entry::getKey)
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.joining(", "));
        int totalMinutes = sessions.stream().mapToInt(WorkoutSession::minutes).sum();

        System.out.println("=== Final Fitness Analytics ===");
        System.out.println("Members tracked: " + totals.size());
        System.out.println("Total minutes: " + totalMinutes);
        System.out.printf("Average minutes: %.1f%n", (double) totalMinutes / totals.size());
        System.out.println("Top member: " + topMember + " (" + topMinutes + " minutes)");
        System.out.println("Goal achievers: " + goalAchievers);
    }
}
