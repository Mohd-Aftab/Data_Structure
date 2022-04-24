import java.util.*;
import java.io.*;

public class Main {

  public static int find(int[]arr, int n, int m) {
      Arrays.sort(arr);
      int lo = 0, hi = m-1;
      int min = Integer.MAX_VALUE;
      while(hi < n){
          int diff = arr[hi] - arr[lo];
          min = Math.min(min, diff);
          lo++;
          hi++;
      }
      return min;
  }

  public static void main(String[]args) {
    Scanner scn = new Scanner(System.in);
    //input work
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int m = scn.nextInt();
    int ans = find(arr, n, m);

    System.out.println(ans);
  }
}