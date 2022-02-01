import java.io.*;
import java.util.*;

public class print_all_palindrome {

	public static void solution(String str){
		//write your code here
		for(int i=0; i<str.length(); i++){
		    for(int j=i; j<str.length(); j++){
		        String s="";
		        for(int k=i; k<=j; k++){
		            char ch = str.charAt(k);
		             s+=ch;
		        }
		        int lo=0, hi=s.length()-1;
		        boolean check = true;
		        while(lo < hi){
		            if(s.charAt(lo) == s.charAt(hi)){
		                lo++;
		                hi--;
		            }else{
		                check = false;
		                break;
		            }
		        }
		        if(check){
		            System.out.println(s);
		        }
		        s="";
		    }
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}