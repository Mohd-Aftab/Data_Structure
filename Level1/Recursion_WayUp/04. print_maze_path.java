import java.io.*;
	import java.util.*;

	public class print_maze_path {

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
	        if(sr > dr || sc > dc){
	            return;
	        }
	        // horizintal move
	        printMazePaths(sr, sc+1, dr, dc, psf+"h");
	        //vertical move
	        printMazePaths(sr+1, sc, dr, dc, psf+"v");
	    }

	}