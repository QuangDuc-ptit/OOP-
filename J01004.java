import java.util.Scanner;

public class J01004 {
    public static boolean ngto(int n ){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            if (ngto(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        scanner.close();
    }
}