import java.util.*;
import java.io.*;

public class Main {

    /*your task is to complete this function which returns true if target exists in the matrix
    else return false*/
    public static boolean search(int[][]matrix,int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            int lele = matrix[i][m-1];
            if(lele == target){
                return true;
            }
            if(lele < target){
                continue;
            }else{
                boolean check = search(matrix[i], target);
                if(check == true){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(int arr[], int tar){
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == tar){
                return true;
            }else if(arr[mid] < tar){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return false;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][]matrix = new int[m][n];

        for(int i=0; i < m;i++) {
            for(int j=0; j < n;j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        boolean isFound = search(matrix,target);
        System.out.println(isFound);

    }
}