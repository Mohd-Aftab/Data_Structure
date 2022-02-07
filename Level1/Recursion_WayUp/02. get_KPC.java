import java.io.*;
import java.util.*;

public class get_KPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(getKPC(str));
    }
    static String[] keyboard = {
        ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"
    };

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> sans = getKPC(ros);
        ArrayList<String> ans = new ArrayList<>();
        
        int n = ch - '0';
        String key = keyboard[n];
        for(int i=0; i<key.length(); i++){
            char c = key.charAt(i);
            for(String s : sans){
                ans.add(c+s);
            }
        }
        return ans;
    }

}