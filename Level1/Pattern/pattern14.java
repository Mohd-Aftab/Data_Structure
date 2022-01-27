import java.util.*;

public class pattern14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int x = 1, i = 1;
    	while(i <= 10){
    		System.out.println(n+" * "+x+" = "+n*x);
    		x++;
    		i++;
    	}

    }
}