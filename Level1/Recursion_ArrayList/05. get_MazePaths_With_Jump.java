import java.io.*;
import java.util.*;

public class get_MazePaths_With_Jump {

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
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i+sc<=dc; i++){
            ArrayList<String> hmoves = getMazePaths(sr, sc+i, dr, dc);
            for(String h : hmoves){
                ans.add("h"+i+h);
            }
        }
        for(int j=1; j+sr<=dr; j++){
            ArrayList<String> vmoves = getMazePaths(sr+j, sc, dr, dc);
            for(String v : vmoves){
                ans.add("v"+j+v);
            }
        }
        for(int i=1, j=1; i+sc<=dc && j+sr<=dr; i++,j++){
            ArrayList<String> dmoves = getMazePaths(sr+i, sc+j, dr, dc);
            for(String d : dmoves){
                ans.add("d"+i+d);
            }
        }
        return ans;
    }

}