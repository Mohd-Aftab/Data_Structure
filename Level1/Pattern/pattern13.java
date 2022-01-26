import java.util.*;
public class pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //write your code here
        for(int i=0; i<n; i++){
    		for(int j=0; j<=i; j++){
    			int f1=1,f2=1,f3=1;
    			for(int k=1; k<=i; k++){
    				f1 = f1*k;
    			}
    			for(int k=1; k<=j; k++){
    				f2 = f2*k;
    			}
    			for(int k=1; k<=(i-j); k++){
    				f3 = f3*k;
    			}
    			int x = f1/(f2*f3);
    			System.out.print(x+"	");
    		}
    		System.out.println();
	    }
    }
}