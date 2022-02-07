import java.io.*;
import java.util.*;

public class get_MazePath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        System.out.println(getMazePaths(1, 1, dr, dc));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr > dr || sc > dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        
        ArrayList<String> hmoves = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> vmoves = getMazePaths(sr+1, sc, dr, dc);
        
        ArrayList<String> ans = new ArrayList<>();
        for(String h : hmoves){
            ans.add('h'+h);
        }
        for(String v : vmoves){
            ans.add('v'+v);
        }
        return ans;
    }

}