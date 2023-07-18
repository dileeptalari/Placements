import java.util.Scanner;
public class Arithematic_operation{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(a%b));
    }
}