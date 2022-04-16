import java.util.*;

public class Main {
    
    //~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~
    public static String nextGreaterElement(String n) {
        // write your code here
        StringBuilder str = new StringBuilder(n+"");
        int i = str.length()-1;
        while(i > 0){
            int c1 = str.charAt(i) - '0';
            int c2 = str.charAt(i-1) - '0';
            if(c2 < c1){
                break;
            }
            i--;
        }
        if(i == 0){
            return "-1";
        }
        int j = i-1;
        int jl = str.length();
        
        for(int k = str.length()-1; k>=0; k--){
            if(str.charAt(k) > str.charAt(j)){
                jl = k;
                break;
            }
        }
        swap(str, j, jl);
        StringBuilder sb = new StringBuilder("");
        sb.append(str.substring(0, j+1));
        for(int k=str.length()-1; k>j;k--){
            sb.append(str.charAt(k));
        }
        long res = Long.parseLong(sb.toString());
        return String.valueOf(res);
        
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