/* SADDLE POINT :-
        The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
    */

import java.io.*;
import java.util.*;

public class saddle_point {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        saddlePoint(arr, n);
    }
    public static void saddlePoint(int arr[][], int n){
        for(int i=0; i<n; i++){
            int rmin = arr[i][0];
            int pcol = 0;
            for(int j=1; j<n; j++){
                if(arr[i][j] < rmin){
                    rmin = arr[i][j];
                    pcol = j;
                }
            }
            boolean check = isSaddle(arr, rmin, pcol);
            if(check){
                System.out.println(rmin);
                return;
            }
        }
        System.out.println("Invalid input");
    }
    public static boolean isSaddle(int arr[][], int rmin, int j){
        for(int i=0; i<arr.length; i++){
            if(arr[i][j] > rmin){
                return false;
            }
        }
        return true;
    }

}