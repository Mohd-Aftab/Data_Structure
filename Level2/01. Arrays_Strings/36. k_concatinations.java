import java.io.*;
import java.util.*;

public class Main {

  public static long solution(int[] arr, int k, long sum) {
    // write your code here
    if(k == 1){
        return kadanes(arr);
    }
    long midSum = sum*(k-2);
    int newArr[] = new int[2*arr.length];
    for(int i=0; i<newArr.length; i++){
        int m = i % arr.length;
        newArr[i] = arr[m];
    }
    
    long twoSum = kadanes(newArr);
    return midSum > 0 ? (midSum+twoSum) : twoSum;
    
  }
  
  public static int kadanes(int arr[]){
      int max = arr[0];
      int csum = arr[0];
      for(int i=1; i<arr.length; i++){
          if(csum > 0){
              csum += arr[i];
          }else{
              csum = arr[i];
          }
          max = Math.max(csum, max);
      }
      return max;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    long sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
      sum += arr[i];
    }
    int k = scn.nextInt();
    System.out.println(solution(arr, k, sum));
  }

}