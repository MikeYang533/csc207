package lab1;

public class Reduce {
    public static int reduce(int n) {
        int steps = 0;
        int current = n;

        while (current > 0) {
            if (current % 2 == 0) {
                current = current / 2;  // Even number: divide by 2
            } else {
                current = current - 1;  // Odd number: subtract 1
            }
            steps++;
        }

        return steps;
    }
}