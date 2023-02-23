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
        int a1 = f1(a0);
        return f1(a1);
    }

    public static int f4(int a0) {
        int a1 = f2(a0);
        int a2 = f2(a1);
        return f2(a2);
    }

    public static int f8(int a0) {
        int a1 = f4(a0);
        int a2 = f4(a1);
        return f4(a2);
    }

    public static int f16(int a0) {
        int a1 = f8(a0);
        int a2 = f8(a1);
        return f8(a2);
    }

    public static int f32(int a0) {
        int a1 = f16(a0);
        int a2 = f16(a1);
        return f16(a2);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an argument");
            return;
        }
        int a0 = Integer.parseInt(args[0]);
        int current = a0;
        int a2 = f2(a0);
        int a4 = f4(a0);
        int a8 = f8(a0);
        int a16 = f16(a0);
        int a32 = f32(a0);
        System.out.println("f1=" + current + " f2=" + a2 + " f4=" + a4 + " f8=" + a8 + " f16=" + a16 + " f32=" + a32);
    }
}
