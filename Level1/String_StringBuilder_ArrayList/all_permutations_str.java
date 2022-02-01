import java.io.*;
import java.util.*;

public class all_permutations_str {
    
    public static int factorial(int n){
        int pro = 1;
        for(int i=2; i<=n; i++){
            pro *= i;
        }
        return pro;
    }
    
	public static void solution(String str){
		int n = str.length();
		int fact = factorial(n);
		
		for(int i=0; i<fact; i++){
		    StringBuilder sb = new StringBuilder(str);
		    StringBuilder s = new StringBuilder("");
		    int l = i;
		    for(int j=n; j>0; j--){
		        int idx = l % j;
		        l /= j;
		        char ch = sb.charAt(idx);
		        sb.deleteCharAt(idx);
		        s.append(ch);
		    }
		    System.out.println(s);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}