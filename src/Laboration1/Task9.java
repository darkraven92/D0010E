public class Raise {
    private static int recRaiseOneCalls = 0;
    private static int recRaiseHalfCalls = 0;

    public static double recRaiseOne(double x, int k) {
        recRaiseOneCalls++;
        if (k == 0) {
            return 1.0;
        } else if (k % 2 == 0) {
            double temp = recRaiseOne(x, k / 2);
            return temp * temp;
        } else {
            return x * recRaiseOne(x, k - 1);
        }
    }

    public static double recRaiseHalf(double x, int k) {
        recRaiseHalfCalls++;
        if (k == 0) {
            return 1.0;
        } else if (k % 2 == 0) {
            double temp = recRaiseHalf(x, k / 2);
            return temp * temp;
        } else {
            double temp = recRaiseHalf(x, (k - 1) / 2);
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        double x = 1.5;
        for (int k = 1; k <= 15; k++) {
            recRaiseOneCalls = 0;
            double resultOne = recRaiseOne(x, k);
            System.out.printf("recRaiseOne(%.1f, %d) = %.6f, recursive calls = %d\n", x, k, resultOne, recRaiseOneCalls);

            recRaiseHalfCalls = 0;
            double resultHalf = recRaiseHalf(x, k);
            System.out.printf("recRaiseHalf(%.1f, %d) = %.6f, recursive calls = %d\n", x, k, resultHalf, recRaiseHalfCalls);

            System.out.println();
        }
    }
}
