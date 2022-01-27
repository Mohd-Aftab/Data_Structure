import java.util.*;

public class pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int row = 1, nst=1, nsp=n/2;
        while(row <= n){
            if(row == n/2 + 1){
                for(int i=1; i<=nsp; i++){
                    System.out.print("*	");
                }
            }
                else{
                    for(int i=1; i<=nsp; i++){
                System.out.print("	");
                }
            }
            for(int i=1; i<=nst; i++){
                System.out.print("*	");
            }
            System.out.println();
            row++;
            if(row <= n/2+1){
                nst+=1;
            }
            else nst -= 1;
        }
    }
}