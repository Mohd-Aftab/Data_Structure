import java.util.*;
import java.io.*;

public class Main {

  public static int minPages(int[]arr, int m) {
      int lo = 0;
      int hi = 0;
      for(int ele : arr){
          lo = Math.max(ele, lo);
          hi += ele;
      }
      int ans = Integer.MAX_VALUE;
      while(lo <= hi){
          int mid = (lo + hi) / 2;
          if(isPossible(arr, m, mid)){
              ans = mid;
              hi = mid - 1;
          }else{
              lo = mid + 1;
          }
      }
      return ans;
  }
  
  public static boolean isPossible(int arr[], int m, int s){
      int st = 1;
      int sum = 0;
      for(int i=0; i<arr.length; i++){
          sum += arr[i];
          if(sum > s){
              sum = arr[i];
              st += 1;
          }
      }
      if(st > m){
          return false;
      }else{
          return true;
      }
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

    int ans = minPages(arr, m);
    System.out.println(ans);
  }
}