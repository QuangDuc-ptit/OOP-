import java.util.Scanner;

public class J01012 {
    public static long dem(long n){
        long s=0;
        if(n<2) return s;
        if (n % 2 == 0) s++;
        for(int i=2; i<=Math.sqrt(n);i++){
             if (n % i == 0) {
                long uoc1 = i;
                long uoc2 = n / i;
                if (uoc1 % 2 == 0) {
                    s++;
                }
                if (uoc1 != uoc2) {
                    if (uoc2 % 2 == 0) {
                        s++;
                    }
                }
            }
        }
        return s;
    }
        
               
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(dem(n));
        }
        sc.close();
    }
}
