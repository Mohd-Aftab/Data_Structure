import java.util.*;

public class pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == j || (i+j) == n+1){
                    System.out.print("*	");
                }
                else System.out.print("	");
            }
            System.out.println();
        }
    }
}