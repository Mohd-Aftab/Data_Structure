import java.util.*;

public class pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int row=1, nsp=n/2, nst=1;
        while(row <= n){
            // spaces 
            for(int i=1; i<=nsp; i++){
                System.out.print("	");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("*	");
            }
            
            System.out.println(); 
            
            // preparation 
            if(row <= n/2){
                //upper half
                nsp--;
                nst += 2;
            }
            else{
                //lower half , r > n/2
                nsp++;
                nst -= 2;
            }
            row++;
        }
    }
}