import java.util.*;

public class inverseN{

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        int count = 1;
        int t = n;
        while(t != 0){
            int rem = t % 10;
            sum += (int)Math.pow(10, rem-1)*count;
            count++;
            t /= 10;
        }
        System.out.println(sum);
    }
}