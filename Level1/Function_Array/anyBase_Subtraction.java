import java.util.*;
  
public class anyBase_Subtraction{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }
    
    public static int getDifference(int b, int n1, int n2){
        int borrow = 0;
        int sum = 0;
        int pow = 0;
        while(n1 != 0 || n2 != 0){
            int d1 = n1 != 0 ? n1 % 10 : 0;
            int d2 = n2 != 0 ? n2 % 10 : 0;
            int dig = d2 - d1 - borrow;
            if(dig < 0){
                borrow = 1;
                dig += b;
            }else{
                borrow = 0;
            }
            sum += Math.pow(10, pow)*dig;
            pow++;
            n1 /= 10;
            n2 /= 10;
        }
        return sum;
    }

}