import java.util.*;

public class pattern20 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(c == 1 || c==n){
                //wall
                System.out.print("*	");
            }
            else{
                if((r == c || r+c == n+1) && r >= (n/2)+1){
                    // diag
                    System.out.print("*	");
                }
                else{
                    System.out.print("	");
                }
            }  
        }
            System.out.println();
        }
        
    }
}