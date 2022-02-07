import java.io.*;
import java.util.*;

public class print_mazepath_jumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        printMazePaths(1, 1, dr, dc, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        // horizontal moves
        for(int i=1; i+sc <= dc; i++){
            printMazePaths(sr, sc+i, dr, dc, psf+"h"+i);
        }
        
        // vertical moves
        for(int i=1; i+sr <= dr; i++){
            printMazePaths(sr+i, sc, dr, dc, psf+"v"+i);
        }
        
        // diagonal moves
        for(int i=1, j=1; i+sc <= dc && j+sr <= dr; i++, j++){
            printMazePaths(sr+i, sc+j, dr, dc, psf+"d"+i);
        }
    }

}
