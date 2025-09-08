import java.util.Scanner;
public class J02005 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] freq = new int[1001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (freq[x] == 0) {
                freq[x] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (freq[x] == 1) {
                freq[x] = 2;
            }
        }
        for (int i = 0; i <= 1000; i++) {
            if (freq[i] == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}