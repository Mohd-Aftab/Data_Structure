import java.io.*;
import java.util.*;

public class get_KPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");
    }
    
    static String[] keyboard = {
        ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"
    };
    
    public static void printKPC(String str, String asf) {
        
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        int n = ch - '0';
        String astr = keyboard[n];
        for(int i=0; i<astr.length(); i++){
            char c = astr.charAt(i);
            printKPC(ros, asf+c);
        }
    }

}
