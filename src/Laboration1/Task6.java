public class LifeLength {
    public static int iterLifeLength(int a0) {
        int length = 1;
        int current = a0;
        while (current != 1) {
            current = next(current);
            length++;
        }
        return length;
    }

    public static int recLifeLength(int a0) {
        if (a0 == 1) {
            return 1;
        } else {
            return 1 + recLifeLength(next(a0));
        }
    }

    private static int next(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + ": " + iterLifeLength(i) + " " + recLifeLength(i));
        }
    }
}
