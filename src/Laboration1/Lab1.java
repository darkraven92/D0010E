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

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an argument");
            return;
        }
        int a0 = Integer.parseInt(args[0]);
        int current = a0;
        while (current != 1) {
            System.out.println(current);
            current = f1(current);
        }
        System.out.println(current);
    }
}
