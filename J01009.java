import java.util.Scanner;

public class J01009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long a=1, s=0;
        for(int i=1;i<=n;++i){
            a*=i;
            s+=a;
        }
        System.out.println(s);
        sc.close();
    }
}
