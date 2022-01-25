import java.util.*;
   
public class rotateN{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int t = n;
        int count = 0;
        while(t != 0){
            count++;
            t /= 10;
        }
        k = k % count;
        if(k < 0){
            k += count;
        }
        int st = n % (int)Math.pow(10, k);
        int rem = n / (int)Math.pow(10, k);
        t = rem;
        int power = 1;
        while(t != 0){
            power *= 10;
            t /= 10;
        }
        int ans = st*power + rem;
        System.out.println(ans);
    }
}