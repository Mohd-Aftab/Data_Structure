import java.util.*;
    
public class gcd_lcm{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int divident = scn.nextInt();
        int divisor = scn.nextInt();
        int n1 = divident;
        int n2 = divisor;
        int rem = divident % divisor;
        while(rem != 0){
            divident = divisor;
            divisor = rem;
            rem = divident % divisor;
        }
        int gcd = divisor;
        int lcm = (n1*n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}