import java.io.*;
import java.util.*;

public class toggle_case {

	public static String toggleCase(String str){
		String ans = "";
		for(int i=0; i<str.length(); i++){
		    char ch = str.charAt(i);
		    if(Character.isUpperCase(ch)){
		        ch = Character.toLowerCase(ch);
		        ans += ch;
		    }else{
		        ch = Character.toUpperCase(ch);
		        ans += ch;
		    }
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}