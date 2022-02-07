import java.io.*;
import java.util.*;

public class get_subsequences {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> sans = gss(ros);
        ArrayList<String> ans = new ArrayList<>();
        for(String s : sans){
            ans.add(s);
        }
        for(String s : sans){
            ans.add(ch+s);
        }
        return ans;
    }

}