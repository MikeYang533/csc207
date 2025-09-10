package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }
    public static int multiples() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        return count;
    }
}
