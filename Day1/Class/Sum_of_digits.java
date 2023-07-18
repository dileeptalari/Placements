import java.util.Scanner;
public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the digit ");
        int digit=in.nextInt();
        
       int sum= sum(digit);
        System.out.println("sum of all the digits is " +sum);

    }
    static int sum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}
