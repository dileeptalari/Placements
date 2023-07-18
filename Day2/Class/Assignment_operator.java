public class Assignment_operator {
    public static void main(String[] args) {
        int a=4;
        int var=a;
        System.out.println("var using = "+var);
        var+=a;//var=var+a
        System.out.println("var using += "+var);
        var-=a;
        System.out.println("var using -= "+var);
        var*=a;
        System.out.println("var using *= " +var);
        var/=a;
        System.out.println("var using /= " +var);
    }
}
