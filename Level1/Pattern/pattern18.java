import java.util.*;

public class pattern18{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // write ur code here
    int row=1, nst=n, nsp=0;
    while(row <= n){
        for(int i=1; i<=nsp; i++){
            
            System.out.print("	");
        }
        for(int i=1; i <= nst; i++){
            if((row > 1 && row < n/2+1)){
                if(i == 1 || i == nst){
                    System.out.print("*	");
                }
                else System.out.print("	");
            }
            else System.out.print("*	");
        }
        row ++;
        System.out.println();
        if(row <= n/2+1){
            nsp++;
            nst -= 2;
        }
        else{
            nsp--;
            nst += 2;
        }
    }

 }
}