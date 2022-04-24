import java.util.*;
import java.io.*;

public class Main {

  public static int countTriplets(int[]arr) {
    //write your code here
    Arrays.sort(arr);
    int count = 0;
    for(int i=arr.length-1; i>=0; i--){
        int lo = 0, hi = i-1;
        int ele = arr[i];
        while(lo < hi){
            int sum = arr[lo] + arr[hi];
            if(sum == ele){
                count++;
                lo++;
                hi--;
            }else if(sum < ele){
                lo++;
            }else{
                hi--;
            }
        }
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

    System.out.println(countTriplets(arr));
  }
}