import java.util.*;
  
public class anyBase_to_anyBase{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int bTod = anyBaseToDecimal(n, sourceBase);
        int dTob = decimalToAnyBase(bTod, destBase);
        System.out.println(dTob);
    }
    
    public static int anyBaseToDecimal(int n, int b){
        int pow = 0;
        int ans = 0;
        while(n != 0){
            int rem = n % 10;
            ans += Math.pow(b, pow)*rem;
            pow++;
            n /= 10;
        }
        return ans;
    }
    
    public static int decimalToAnyBase(int n, int b){
        int ans = 0;
        int pow = 0;
        while(n != 0){
            int rem = n % b;
            ans += Math.pow(10, pow)*rem;
            n /= b;
            pow++;
        }
        return ans;
    }
}