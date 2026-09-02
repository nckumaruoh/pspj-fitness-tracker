/** Week 10: validate external input and report errors without crashing the tracker. */
public class FitnessInputValidator {
    static class InvalidWorkoutException extends Exception {
        InvalidWorkoutException(String message) { super(message); }
    }

    static int validateDuration(String raw) throws InvalidWorkoutException {
        try {
            int minutes = Integer.parseInt(raw);
            if (minutes < 1 || minutes > 300) {
                throw new InvalidWorkoutException("Workout duration must be from 1 to 300 minutes.");
            }
            return minutes;
        } catch (NumberFormatException exception) {
            throw new InvalidWorkoutException("Workout duration must be a whole number.");
        }
    }

    public static void main(String[] args) {
        String[] submissions = {"45", "0", "walk"};
        for (String submission : submissions) {
            try {
                System.out.println("Accepted duration: " + validateDuration(submission));
            } catch (InvalidWorkoutException exception) {
                System.out.println("Rejected duration '" + submission + "': " + exception.getMessage());
            }
        }
    }
}
