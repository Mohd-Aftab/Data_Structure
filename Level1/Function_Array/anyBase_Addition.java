import java.util.*;
  
public class anyBase_Addition{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int d = getSum(b, n1, n2);
        System.out.println(d);
    }
    
    public static int getSum(int b, int n1, int n2){
        int sum = 0;
        int pow = 0;
        int carry = 0;
        while(n1 != 0 || n2 != 0){
            int d1 = n1 != 0 ? n1 % 10 : 0;
            int d2 = n2 != 0 ? n2 % 10 : 0;
            int digit = d1 + d2 + carry;
            carry = digit / b;
            sum += Math.pow(10, pow)*(digit % b);
            pow++;
            n1 /= 10;
            n2 /= 10;
        }
        
        if(carry != 0){
            sum += Math.pow(10, pow)*carry;
        }
        return sum;
    }
}