import java.util.*;

public class next_greater_III {
    
    //~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~
    public static String nextGreaterElement(String s) {
        // write your code here
        StringBuilder str = new StringBuilder(s+"");
        int i=str.length()-1;
        while(i > 0){
            if(str.charAt(i-1) < str.charAt(i)){
                // dip
                break;
            }
            i--;
        }
        if(i == 0){
            return "-1";
        }
        int j= i-1;
        int jl = -1;
        for(int k=str.length()-1; k>j; k--){
            if(str.charAt(k) > str.charAt(j)){
                jl = k;
                break;
            }
        }
        swap(str, j, jl);
        StringBuilder ans = new StringBuilder("");
        ans.append(str.substring(0, j+1));
        for(int k=str.length()-1; k>j; k--){
            ans.append(str.charAt(k));
        }
        
        return ans.toString();
    }
    public static void swap(StringBuilder str, int i, int j){
        char chi = str.charAt(i);
        char chj = str.charAt(j);
        
        str.setCharAt(i, chj);
        str.setCharAt(j, chi);
    }

    //~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = scn.next();
        String res = nextGreaterElement(num);

        System.out.println(res);
    }
}