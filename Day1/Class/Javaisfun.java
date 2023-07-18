import java.util.Scanner;
public class Javaisfun {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of times ypu want to print");
        
        int n=in.nextInt();
        String name="Java is Fun";
        for(int i=1;i<=n;i++){
            System.out.println(name);
        }
    }
}
