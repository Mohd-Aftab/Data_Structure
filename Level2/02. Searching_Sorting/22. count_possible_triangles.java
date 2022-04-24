import java.util.*;
import java.io.*;

public class Main {

  public static int countTriangles(int[]arr) {
    //write your code here
    int count = 0;
    Arrays.sort(arr);
    int i = arr.length-1;
    
    while(i >= 2){
        int lo = 0, hi = i-1;
        while(lo < hi){
            int sum = arr[lo] + arr[hi];
            if(sum > arr[i]){
                count += (hi - lo);
                hi--;
            }else{
                lo++;
            }
        }
        i--;
    }
    
    return count;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countTriangles(arr));
  }
}