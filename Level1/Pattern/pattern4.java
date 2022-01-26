import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=n; i>0; i--){
            int s;
            for(s=1; s<=n-i; s++){
                System.out.print("	");
            }
            for(int j=s; j<=n; j++){
                System.out.print("*	");
            }
            System.out.println();
        }

    }
}