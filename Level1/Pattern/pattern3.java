import java.util.*;

public class pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
            int s;
            for(s=0; s<n-i-1; s++){
                System.out.print("	");
            }
            for(int j=s; j<n; j++){
                System.out.print("*	");
            }
            System.out.println();
        }

    }
}