public class Raise {
    
    public static double recRaiseHalf(double x, int k) {
        if (k == 0) {
            return 1;
        } else if (k % 2 == 0) {
            double temp = recRaiseHalf(x, k / 2);
            return temp * temp;
        } else {
            double temp = recRaiseHalf(x, k / 2);
            return x * temp * temp;
        }
    }
    
    public static void main(String[] args) {
        double x = 2;
        int k = 5;
        System.out.println(recRaiseHalf(x, k)); // expected output: 32.0
    }
    
}
