import java.util.*;

public class pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
     // write ur code here
    int row=1, nsp1=n/2, nsp2=-1;
	while(row <= n){
		for(int i=1; i<=nsp1; i++){
			System.out.print("	");
		}
		System.out.print("*	");
		for(int i=1; i<=nsp2; i++){
			System.out.print("	");
		}
		if(row != 1 && row != n){
			System.out.print("*	");
		}
		System.out.println();
		
		//preparation
		if(row <= n/2){
			nsp1--;
			nsp2 += 2;
		}
		else{
			nsp1++;
			nsp2 -= 2;
		}
		row++;
	}
 }
}