import java.io.*;
import java.util.*;

public class string_compression {

	public static String compression1(String str){
		String ans = str.charAt(0)+"";
		for(int i=1; i<str.length(); i++){
		    if(str.charAt(i) == str.charAt(i-1)){
		        
		    }else{
		        ans = ans + str.charAt(i);
		    }
		}
		return ans;
	}

	public static String compression2(String str){
		String ans = "";
		int count = 1;
		for(int i=0; i<str.length()-1; i++){
		    if(str.charAt(i) == str.charAt(i+1)){
		        count++;
		    }else{
		        if(count == 1){
		            ans = ans + str.charAt(i);
		        }
		        else ans = ans + str.charAt(i)+count;
		        count=1;;
		    }
		}
		if(count == 1){
		    return ans + str.charAt(str.length()-1);
	    }
		return ans + str.charAt(str.length()-1)+count;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}