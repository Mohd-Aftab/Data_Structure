import java.io.*;
import java.util.*;

public class search_in_2D {

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
        int tar = scn.nextInt();
        searchIn2D(arr, n, tar);
    }
    public static void searchIn2D(int arr[][], int n, int tar){
        
        for(int i=0; i<n; i++){
            if(tar >= arr[i][0] && tar <= arr[i][n-1]){
                int j = binarySearch(arr[i], n, tar);
                if(j >= 0){
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
    public static int binarySearch(int arr[], int n, int tar){
        int lo = 0, hi = n-1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] == tar){
                return mid;
            }else if(arr[mid] < tar){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return -1;
    }

}