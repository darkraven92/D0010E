public class LifeLength {

    public static int f(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static int iterLifeLength(int a0) {
        int count = 0;
        int num = a0;
        while (num != 1) {
            num = f(num);
            count++;
        }
        return count;
    }

    public static String intsToString(int X, int Y) {
        return "The life length of " + X + " is " + Y + ".";
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int lifeLength = iterLifeLength(i);
            System.out.println(intsToString(i, lifeLength));
        }
    }
}
