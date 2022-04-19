import java.util.*;
import java.io.*;

public class Main {
    
    
    
    public static void main(String[]args) {
        //write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(inversion(arr, n));
    }
    static int ic = 0;
    public static int inversion(int arr[], int n){
        ic = 0;
        arr = mergeSort(arr, 0, n-1);
        return ic;
    }
    
    public static int[] mergeSort(int[] arr, int lo, int hi){
        if(lo == hi){
            int[] base = new int[1];
            base[0] = arr[lo];
            return base;
        }
        int mid = (lo+hi) / 2;
        int left[] = mergeSort(arr, lo, mid);
        int right[] = mergeSort(arr, mid+1, hi);
        int res[] = merge(left, right);
        return res;
    }
    
    public static int[] merge(int[] left, int[] right){
        int n = left.length;
        int m = right.length; 
        int i=0, j=0, k=0;
        int res[] = new int[n+m];
        while(i < n && j < m){
            if(left[i] <= right[j]){
                res[k] = left[i];
                i++;
            }else{
                ic += (n-i);
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n){
            res[k] = left[i];
            i++;
            k++;
        }
        while(j < m){
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
}