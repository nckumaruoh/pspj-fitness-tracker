/** Week 9: model members and workout sessions as collaborating objects. */
public class FitnessTrackerApp {
    static class WorkoutSession {
        private final String activity;
        private final int minutes;

        WorkoutSession(String activity, int minutes) {
            this.activity = activity;
            this.minutes = minutes;
        }

        int minutes() { return minutes; }
        String activity() { return activity; }
    }

    static class Member {
        private final String name;
        private final WorkoutSession[] sessions;
        private int count;

        Member(String name, int capacity) {
            this.name = name;
            this.sessions = new WorkoutSession[capacity];
        }

        void log(WorkoutSession session) {
            if (count == sessions.length) throw new IllegalStateException("Session capacity reached");
            sessions[count++] = session;
        }

        int totalMinutes() {
            int total = 0;
            for (int index = 0; index < count; index++) total += sessions[index].minutes();
            return total;
        }

        void printProgress() {
            System.out.println("Member: " + name + " | Level: ACTIVE");
            System.out.println("Sessions: " + count + " | Minutes: " + totalMinutes());
            System.out.printf("Average/session: %.1f%n", count == 0 ? 0.0 : (double) totalMinutes() / count);
            System.out.println("Latest activity: " + sessions[count - 1].activity());
        }
    }

    public static void main(String[] args) {
        Member asha = new Member("Asha", 5);
        asha.log(new WorkoutSession("Cardio", 35));
        asha.log(new WorkoutSession("Strength", 40));
        asha.printProgress();
    }
}
