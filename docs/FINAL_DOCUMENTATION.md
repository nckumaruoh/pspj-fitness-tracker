# Personal Fitness & Workout Tracker — final documentation

## Purpose

The Personal Fitness & Workout Tracker is a console-based PSPJ project that helps a learner record workout minutes, compare them against goals, preserve basic sessions and generate a final progress report. The project is intentionally built as twelve small Java increments so every programming construct is introduced with an executable artifact.

## Weekly delivery map

| Week | Focus | Runnable artifact | Verification evidence |
| --- | --- | --- | --- |
| 1 | Baseline record | `week-01/FitnessTracker.java` | `week-01/TRACE.md` |
| 2 | Goal calculation | `week-02/WorkoutProgress.java` | `week-02/TRACE.md` |
| 3 | Weekly total | `week-03/WeeklyWorkout.java` | `week-03/TRACE.md` |
| 4 | Menu and loops | `week-04/FitnessMenu.java` | `week-04/TRACE.md` |
| 5 | Methods | `week-05/WorkoutService.java` | `week-05/TRACE.md` |
| 6 | Arrays and search | `week-06/WorkoutArrayTracker.java` | `week-06/TRACE.md` |
| 7 | Modularity and edge cases | `week-07/WorkoutPlan.java` | `week-07/TRACE.md` |
| 8 | Recursion | `week-08/StreakCalculator.java` | `week-08/TRACE.md` |
| 9 | Classes and objects | `week-09/FitnessTrackerApp.java` | `week-09/TRACE.md` |
| 10 | Validation and exceptions | `week-10/FitnessInputValidator.java` | `week-10/TRACE.md` |
| 11 | File persistence | `week-11/FitnessFileStore.java` | `week-11/TRACE.md` |
| 12 | Collections and streams | `week-12/FitnessAnalytics.java` | `week-12/TRACE.md` |

## Final release behaviour

The Week 12 release uses a list of session objects, groups totals by member, finds the leading member and identifies members meeting the weekly goal. Its deterministic demonstration reports three members, 265 total minutes, an 88.3-minute average, Ravi as the leading member and Asha/Ravi as goal achievers.

## Execution procedure

Each weekly folder is independent. Open a terminal in the target week folder, compile its single Java file with `javac`, then run the matching class with `java`. For example:

```text
cd week-12
javac FitnessAnalytics.java
java FitnessAnalytics
```

The Week 11 program writes and re-reads `fitness-sessions.csv` from its own folder. All other weeks use deterministic in-memory sample data, so output is stable and reproducible.

## Quality checks

- Each weekly Java artifact compiles with Java 21.
- Each program has a documented expected console trace and an exact OUTPUT.txt record.
- Week 7 explicitly tests a zero-minute session edge case.
- Week 10 explicitly tests numeric and non-numeric invalid input.
- Week 11 verifies that the stored CSV data can be reloaded and totalled.
- Week 12 verifies the complete analytics result.

## Submission checklist

1. Pull the latest `main` branch before beginning the week.
2. Complete only that week's target.
3. Compile and run the program; retain the console output as evidence.
4. Commit with `W##: target completed`.
5. Push the commit and submit the commit URL, source, procedure and trace.
