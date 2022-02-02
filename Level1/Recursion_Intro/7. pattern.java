/*

    *	
    *	*	
    *	*	*	
    *	*	*	*	
    *	*	*	*	*	

 */
import java.util.*;

public class pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        if(n == 0){
            return;
        }
        pattern(n-1);
        for(int i=0; i<n; i++){
            System.out.print("*\t");
        }
        System.out.println();
    }
}