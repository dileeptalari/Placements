package Home_work;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Five numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("Sum of the digits are : "+sum);
    }
}
