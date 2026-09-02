import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/** Week 11: save and restore simple fitness records using a CSV text file. */
public class FitnessFileStore {
    private static final Path STORE = Path.of("fitness-sessions.csv");

    static void saveSessions(List<String> rows) throws IOException {
        Files.write(STORE, rows, StandardCharsets.UTF_8);
    }

    static int totalMinutes(List<String> rows) {
        int total = 0;
        for (int index = 1; index < rows.size(); index++) {
            String[] columns = rows.get(index).split(",");
            total += Integer.parseInt(columns[2]);
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        List<String> sessions = List.of(
            "member,activity,minutes",
            "Asha,Cardio,35",
            "Asha,Strength,40",
            "Ravi,Walk,45"
        );
        saveSessions(sessions);
        List<String> restored = Files.readAllLines(STORE, StandardCharsets.UTF_8);
        System.out.println("Saved " + (sessions.size() - 1) + " sessions to " + STORE.getFileName());
        System.out.println("Loaded sessions: " + (restored.size() - 1));
        System.out.println("Total minutes from file: " + totalMinutes(restored));
    }
}
