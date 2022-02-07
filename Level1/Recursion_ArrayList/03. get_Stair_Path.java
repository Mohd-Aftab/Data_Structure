import java.io.*;
import java.util.*;

public class get_Stair_Path {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(n < 0){
            return new ArrayList<>();
        }
        ArrayList<String> one = getStairPaths(n-1);
        ArrayList<String> two = getStairPaths(n-2);
        ArrayList<String> three = getStairPaths(n-3);
        
        ArrayList<String> ans = new ArrayList<>();
        for(String s : one){
            ans.add('1'+s);
        }
        for(String s : two){
            ans.add('2'+s);
        }
        for(String s : three){
            ans.add('3'+s);
        }
        return ans;
    }

}