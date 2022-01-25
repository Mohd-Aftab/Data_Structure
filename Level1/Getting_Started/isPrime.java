import java.util.*;

public class isPrime {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int x = 1;
        while(x <= t){
            int n = scn.nextInt();
            // isPrime_rootn(n);
            isPrime_n(n);
            x++;
        }
    }

    public static void isPrime_rootn(int n){
        boolean check = true;
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    public static void isPrime_n(int n){
        boolean check = true;
        for(int i=2; i < n; i++){
            if(n % i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}
