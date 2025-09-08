import java.util.Scanner;

public class J01005 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            double h=sc.nextDouble();
            for (int i=1;i<=n-1;i++)
                System.out.printf("%.6f ", h*Math.sqrt(i)/Math.sqrt(n));
            System.out.println();
        }
        sc.close();
    }
}