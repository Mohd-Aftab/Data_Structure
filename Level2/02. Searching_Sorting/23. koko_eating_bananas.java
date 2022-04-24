import java.util.*;
import java.io.*;

public class Main {
    public static int minEatingSpeed(int[]piles,int h) {
        int lo = 0;
        int hi = 0;
        for(int ele : piles){
            hi = Math.max(hi, ele);
        }
        
        int k = Integer.MAX_VALUE;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            int ch = calculate(piles, mid);
            if(ch <= h){
                k = Math.min(k, mid);
                // System.out.println("For mid : "+ mid + " -> " + k);
                hi = mid - 1;
            }else{
                lo = mid+1;
            }
        }
        return k;
    }
    
    public static int calculate(int[] arr, int s){
        int k = 0;
        for(int i=0; i<arr.length; i++){
            int ele = arr[i];
            k += (ele / s);
            if(ele % s != 0){
                k = k+1;
            }
        }
        return k;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]piles = new int[n];

        for(int i=0 ; i < n ; i++) {
            piles[i] = scn.nextInt();
        }

        int h = scn.nextInt();

        int speed = minEatingSpeed(piles,h);
        System.out.println(speed);
    }
}