import java.util.*;

public class pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int nsp=n/2, nst=1, row=1;
    	int x=row;
    	while(row <= n){
    		for(int i=1; i<=nsp; i++){
    			System.out.print("	");
    		}
    		for(int i=x; i<=nst; i++){
    		    System.out.print(i+"	");
    		}
    		int nst1 = nst-1;
    		for(int i=nst1; i>=x; i--){
    			System.out.print(i+"	");
    		}
    		row++;
    		if(row <= (n/2) + 1){
    			nst += 2;
    			nsp -= 1;
    			x++;
    		}
    		else{
    			nst -= 2;
    			nsp += 1;
    			x--;
    		}
    		System.out.println();
    	}
    }
}