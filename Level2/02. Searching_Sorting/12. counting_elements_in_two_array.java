import java.util.*;
import java.io.*;

public class Main {

  public static int[] find(int[]arr1, int[]arr2) {
      Arrays.sort(arr2);
      int i=0, j=0;
      int res[] = new int[arr1.length];
      
      while(i < arr1.length){
          int lo = 0, hi = arr2.length-1;
          int val = arr1[i];
          int count = 0;
          while(lo <= hi){
              int mid = (lo + hi) / 2;
              if(arr2[mid] <= val){
                  count += (mid-lo) + 1;
                  lo = mid + 1;
              }else{
                  hi = mid - 1;
              }
          }
          res[i] = count;
          i++;
      }
      return res;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int[]a = new int[n1];

    for (int i = 0; i < n1; i++) {
      a[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[]b = new int[n2];

    for (int i = 0; i < n2; i++) {
      b[i] = scn.nextInt();
    }

    int[]ans = find(a, b);

    for (int val : ans) {
      System.out.print(val + " ");
    }
  }
}   