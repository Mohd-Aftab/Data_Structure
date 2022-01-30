import java.io.*;
import java.util.*;

public class spiral_display {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int total = n*m;
        int minr = 0, maxr=n-1, minc = 0, maxc = m-1, count=0;
        while(count < total){
            // left wall 
            for(int i=minr, j=minc; i<=maxr && count < total; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //bottom wall
            for(int j=minc, i=maxr; j<=maxc && count < total; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            // right wall
            for(int i=maxr, j=maxc; i>=minr && count < total; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            //Top wall
            for(int j=maxc, i=minr; j>=minc && count < total; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }

}