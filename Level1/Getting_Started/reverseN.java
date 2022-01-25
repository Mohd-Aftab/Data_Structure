import java.util.*;

public class reverseN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = n;
        while(t != 0){
            int rem = t % 10;
            System.out.println(rem);
            t /= 10;
        }
    }
}
