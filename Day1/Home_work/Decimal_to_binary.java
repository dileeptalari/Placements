package Home_work;
import java.util.Scanner;
public class Decimal_to_binary{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Decimal Number");
    int num=sc.nextInt();
    System.out.print("decimal to binary conversion of " +num +" is :  "  );
    System.out.println(Integer.toBinaryString( num));
}
}