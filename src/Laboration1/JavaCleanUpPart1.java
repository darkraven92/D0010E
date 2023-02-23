import java.util.*;

public class LifeLength {
    
    // Task 1: Define the function f(x)
    public static int f(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return 3 * x + 1;
        }
    }
    
    // Task 2: Implement a method that computes the life length of a number using iteration
    public static int iterLifeLength(int x) {
        int count = 0;
        while (x != 1) {
            x = f(x);
            count++;
        }
        return count;
    }
    
    // Task 3: Implement a method that computes the life length of a number using recursion
    public static int recLifeLength(int x) {
        if (x == 1) {
            return 0;
        } else {
            return 1 + recLifeLength(f(x));
        }
    }
    
    // Task 4: Modify the program to output the life lengths computed by both methods side-by-side
    public static void printLifeLengths(int n) {
        System.out.printf("%-10s%-10s\n", "Iterative", "Recursive");
        for (int i = 1; i <= n; i++) {
            int iterLen = iterLifeLength(i);
            int recLen = recLifeLength(i);
            System.out.printf("%-10d%-10d\n", iterLen, recLen);
        }
    }
    
    // Task 6: Add a recursive method that computes the life length of a number
    public static int recLifeLength(int x, int k) {
        if (x == 1) {
            return k;
        } else {
            return recLifeLength(f(x), k + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a task number (1-6): ");
        int task = scanner.nextInt();
        
        switch (task) {
            case 1:
                System.out.println(f(17));
                break;
            case 2:
                int iterLen = iterLifeLength(17);
                System.out.println(iterLen);
                break;
            case 3:
                int recLen = recLifeLength(17);
                System.out.println(recLen);
                break;
            case 4:
                printLifeLengths(15);
                break;
            case 6:
                int recLen2 = recLifeLength(17, 0);
                System.out.println(recLen2);
                break;
            default:
                System.out.println("Invalid task number.");
        }
    }
}
