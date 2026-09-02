# Week 7 procedure — modularity and edge cases

1. Create a `WorkoutPlan` object with member and weekly-goal state.
2. Keep session updates inside `addSession`.
3. Reject zero or negative durations without changing stored totals.
4. Expose `remainingMinutes` as a focused calculation method.
5. Print a summary after testing both valid sessions and a zero-minute edge case.

Compile and run with `javac WorkoutPlan.java` followed by `java WorkoutPlan`.
