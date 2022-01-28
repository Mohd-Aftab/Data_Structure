import java.util.*;

public class anyBase_Multiplication{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
    
    public static int getSingleMul(int x, int n1, int b){
        int carry = 0, sum = 0, pow = 1;
        while(n1 != 0 || carry > 0){
            int rem = n1 % 10;
            int mul = rem * x + carry;
            int rem1 = mul % b;
            carry = mul / b;
            sum += (pow * rem1);
            pow *= 10;
            n1 /= 10;
        }
        return sum;
    }
    public static int getSum(int b, int n1, int n2){
        int sum = 0, carry = 0, pow = 1;
        while(n1 != 0 || n2 != 0){
            int v1 = n1 % 10; 
            int v2 = n2 % 10;
            int dig = v1 + v2 + carry; 
            sum += pow*(dig % b); 
            if(dig >= b){
                carry = 1; 
            }else carry = 0;
            
            n1 /= 10; 
            n2 /= 10;
            pow *= 10;
        }
        if(carry > 0){
            sum += carry*pow;
        }
        return sum;
    }
    public static int getProduct(int b, int n1, int n2){
        int carry = 0, pow = 1, sum=0;
        while(n2 != 0){
            int x = n2 % 10;
            int digit = getSingleMul(x, n1, b);
            sum = getSum(b, digit*pow, sum);
            n2 /= 10;
            pow *= 10;
        }
        return sum;
    }

}