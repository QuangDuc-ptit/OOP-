import java.util.Scanner;

public class J01011 {
    public static long gcd(long a, long b) {
            while (b != 0) {
                long temp = a % b;
                a = b;
                b = temp;
            }
            return a;
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long ucln = gcd(a, b);
            long bcnn = lcm(a, b);
            
            System.out.println(bcnn + " " + ucln);
        }
        scanner.close();
    }
}