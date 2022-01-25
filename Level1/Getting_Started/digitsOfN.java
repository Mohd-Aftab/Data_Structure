import java.util.*;

public class digitsOfN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = n, count = 0;
        while(t != 0){
            int rem = t % 10;
            count++;
            t /= 10;
        }
        t = n;
        int pow = (int)Math.pow(10, count-1);
        while(count > 0){
            int rem = t / pow;
            System.out.println(rem);
            t %= pow;
            pow /= 10;
            count--;
        }
    }
}
