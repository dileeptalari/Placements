public class sum_tracing {
    public static void main(String[] args) {
        int n=11110;
       System.out.println(sumdigit(n)); 
    }
    static int sumdigit(int n){
            return n==0 ? 0 : n%10+sumdigit(n/10);
    }
    
    
}
