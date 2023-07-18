public class Increment_decrement {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int result1=a++;/* Post increment first assign and then increment
                            result1=10
                            a=11
                             */
        System.out.println("after post Increment : "+result1);
        int result2=--b; //pre decrement first decrement and then assign the value
        System.out.println("After decrement : "+result2);
        int result3=a--;
        System.out.println("After post decrement : "+result3);
        int result4=b++;
        System.out.println("After post increment : "+result4);
    }
}
