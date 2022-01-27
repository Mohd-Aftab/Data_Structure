import java.util.*;

public class pattern16{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // write ur code here
    int nsp = 2*n -3 ;
    for(int i=1; i<=n; i++){
        for(int k=1; k<=i; k++){
            System.out.print(k+"	");
        }
        for(int j=1; j<=nsp; j++){
            System.out.print("	");
        }
        if(i == n){
            for(int k=i-1; k>=1; k--){
                System.out.print(k+"	");
            }
        }
        else {
        for(int k=i ; k>=1; k--){
                System.out.print(k+"	");
            }
            
        }
        System.out.println();
        nsp -= 2;
    }
 }
}