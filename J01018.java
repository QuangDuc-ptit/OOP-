import java.util.Scanner;

public class J01018 {
    public static boolean check(String s){
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i) - s.charAt(i+1)) != 2) return false;
            sum += s.charAt(i) -'0';
        }
        sum+= (s.charAt(s.length()-1) - '0');
        return sum%10==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
