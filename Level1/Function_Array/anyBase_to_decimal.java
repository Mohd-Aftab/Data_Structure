import java.util.*;
  
public class anyBase_to_decimal{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }
    
    public static int getValueIndecimal(int n, int b){
        int pow = 0;
        int ans = 0;
        while(n != 0){
            int rem = n % 10;
            ans += Math.pow(b, pow)*rem;
            n /= 10;
            pow++;
        }
        return ans;
    }
}