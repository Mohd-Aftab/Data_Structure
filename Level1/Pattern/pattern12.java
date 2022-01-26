import java.util.*;

public class pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        // write ur code here
        int a=0, b=1, c,i;
        for(i=1; i<=t; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+"	");
                c = a+b;
                a = b;
                b = c;
            }
            System.out.println();
        }
        
    }
}