public class LifeLength {
    public static int f1(int a0) {
        if (a0 == 1) {
            return 1;
        } else if (a0 % 2 == 0) {
            return a0 / 2;
        } else {
            return 3 * a0 + 1;
        }
    }

    public static int f2(int a0) {
        return f1(f1(a0));
    }

    public static int f4(int a0) {
        return f2(f2(a0));
    }

    public static int f8(int a0) {
        return f4(f4(a0));
    }

    public static int f16(int a0) {
        return f8(f8(a0));
    }

    public static int f32(int a0) {
        return f16(f16(a0));
    }

    public static int iterateF(int a0, int n) {
        if (n == 0) {
            return a0;
        } else {
            return iterateF(f1(a0), n - 1);
        }
    }

    public static void main(String[] args) {
        // int first = Integer.parseInt(args[0]);
        int a0 = 3;

        // int second = Integer.parseInt(args[1]);

        // Call f1, f2, f4, f8, f16, and f32 with a0 as input and print the results
        System.out.println("f1=" + f1(a0) + " f2=" + f2(a0) + " f4=" + f4(a0) + " f8=" + f8(a0) + " f16=" + f16(a0) + " f32=" + f32(a0));

        // Call iterateF with various inputs and print the results
        System.out.println("iterateF(3,5)=" + iterateF(3, 5));
        System.out.println("iterateF(42,3)=" + iterateF(42, 3));
        System.out.println("iterateF(1,3)=" + iterateF(1, 3));
    }
}
