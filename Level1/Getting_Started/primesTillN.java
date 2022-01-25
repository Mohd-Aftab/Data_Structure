import java.util.*;

public class primesTillN {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        while(lo <= hi){
            isPrime(lo);
            lo++;
        }
    }
   public static void isPrime(int n){
        boolean check = true;
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(n);
        }
    }
}
