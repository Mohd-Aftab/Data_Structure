import java.io.*;
import java.util.*;

public class broken_economy{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        denomination(arr, n, tar);
    }
    public static void denomination(int arr[], int n, int tar){
        int lo=0, hi=n-1;
        while(lo <= hi){
            int mid = (lo+hi) / 2;
            if(arr[mid] == tar){
                System.out.println(arr[mid]);
                return;
            }else if(arr[mid] < tar){
                lo = mid+1;
            }else{
                hi = mid - 1;
            }
        }
        System.out.println(arr[lo]); 
        System.out.println(arr[hi]);
    }

}