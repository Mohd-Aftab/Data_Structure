import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial_n(n));
    }

    public static int factorial_n(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial_n(n-1);
    }

}