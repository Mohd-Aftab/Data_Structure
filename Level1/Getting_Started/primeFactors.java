import java.util.*;

public class primeFactors{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=2; i*i<=n; i++){
            while(n != 0){
                if(n % i == 0){
                    System.out.print(i+" ");
                    n /= i;
                }else{
                    break;
                }
            }
        }
        if(n != 0){
            System.out.println(n);
        }
    }
}