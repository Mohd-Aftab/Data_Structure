import java.util.*;
import java.io.*;

public class Main {

  public static int splitArray(int[]arr, int m) {
      int lo = 0, hi = 0;
      for(int ele : arr){
          lo = Math.max(lo, ele);
          hi += ele;
      }
      int ans = 0;
      while(lo <= hi){
          int mid = (lo + hi) / 2;
          boolean cs = helper(arr, mid, m);
          if(cs){
              ans = mid;
              hi = mid - 1;
          }else{
              lo = mid + 1;
          }
      }
      return ans;
  }
  public static boolean helper(int[] arr, int mid, int m){
      int st = 1;
      int sum = 0;
      for(int i=0; i<arr.length; i++){
          int ele = arr[i];
          sum += ele;
          if(sum > mid){
              st += 1;
              sum = ele;
          }
      }
      return st <= m;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int m = scn.nextInt();

    int ans = splitArray(arr, m);
    System.out.println(ans);
  }
}