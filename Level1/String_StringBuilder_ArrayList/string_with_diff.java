/*
    input :- pepCODinG
    output :- p-11e11p-45C12O-11D37i5n-39G
*/

import java.io.*;
import java.util.*;

public class string_with_diff {

	public static String solution(String str){
		String ans = "";
		for(int i=0; i<str.length()-1; i++){
		    char ch1 = str.charAt(i);
		    char ch2 = str.charAt(i+1);
		    ans += ch1;
		    int diff = (int)ch2 - (int)ch1;
		    ans += diff;
		}
		return ans+str.charAt(str.length()-1);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}