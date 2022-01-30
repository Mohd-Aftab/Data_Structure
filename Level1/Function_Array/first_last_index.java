import java.io.*;
import java.util.*;

public class first_last_index{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        first_last(arr, n, tar);
    }
    public static void first_last(int arr[], int n, int tar){
        int lo=0, hi=n-1;
        while(lo <= hi){
            int mid = (lo+hi) / 2;
            if(arr[mid] == tar){
                int nl = mid, nh = mid;
                while(nl >= 0 && arr[nl] == tar){
                    nl--;
                }while(nh < n && arr[nh] == tar){
                    nh++;
                }
                System.out.println((nl+1) + "\n" + (nh-1));
                return;
            }else if(arr[mid] < tar){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        System.out.println(-1 + "\n" + -1);
    }

}