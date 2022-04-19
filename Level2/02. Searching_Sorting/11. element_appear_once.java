import java.util.*;
import java.io.*;

public class Main {

  public static int findSingleElement(int[]arr) {
    int lo=0, hi=arr.length-1;
    while(lo <= hi){
        int mid = (lo+hi)/ 2;
        if(mid == 0){
            if(arr[mid] != arr[mid+1]){
                return arr[mid];
            }
        }
        if(arr[mid] == arr.length-1){
            if(arr[mid] != arr[mid-1]){
                return arr[mid];
            }
        }
        
        if(arr[mid] == arr[mid-1]){
            int nl = (mid-lo)+1;
            if(nl % 2 == 0){
                lo = mid+1;
            }else{
                hi = mid - 2;
            }
        }else if(arr[mid] == arr[mid+1]){
            int nr = (hi-mid)+1;
            if(nr % 2 == 0){
                hi = mid-1;
            }else{
                lo = mid+2;
            }
        }else{
            return arr[mid];
        }
    }
    return arr[lo];
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int ans = findSingleElement(arr);
    System.out.println(ans);
  }
}