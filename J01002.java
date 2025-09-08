import java.util.Scanner;

public class J01002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while(a-->0){
            long b=scanner.nextLong();
            System.out.println(b*(b+1)/2);

        }
        scanner.close();
    }
        

}
