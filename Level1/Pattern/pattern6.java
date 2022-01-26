import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int row=1, nsp=1, nst=(n+1)/2;
      while(row <= n){
        for(int i=1; i<=nst; i++){
          System.out.print("*	");
        }
        for(int i=1; i<=nsp; i++){
          System.out.print("	");
        }
        for(int i=1; i<=nst; i++){
          System.out.print("*	");
        }
        System.out.println();
        if(row < (n+1)/2){
          nst -= 1;
          nsp += 2;
        }
        else{
          nst += 1;
          nsp -= 2;
        }
        row++;
      }
    }
}