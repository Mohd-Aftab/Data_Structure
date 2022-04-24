import java.util.*;
import java.io.*;

public class Main {
    public static int findSmallestDivisor(int[]nums,int th) {
        //write your code here
        int hi = 0, lo = 0;
        for(int ele : nums){
            hi = Math.max(ele, hi);
        }
        int k = Integer.MAX_VALUE;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            int ch = helper(nums, mid);
            if(ch <= th){
                k = Math.min(mid, k);
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
        }
        return k;
    }
    
    public static int helper(int arr[], int s){
        int k = 0;
        for(int ele : arr){
            k += (ele / s);
            if(ele % s != 0){
                k += 1;
            }
        }
        return k;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]nums = new int[n];

        for(int i=0 ; i < n ; i++) {
            nums[i] = scn.nextInt();
        }

        int th = scn.nextInt();

        int speed = findSmallestDivisor(nums,th);
        System.out.println(speed);
    }
}