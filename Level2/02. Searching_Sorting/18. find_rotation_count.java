import java.util.*;

public class Main {

    public static int findRotationCount(int[]arr) {
        int lo = 0, hi = arr.length-1;
        if(arr[lo] <= arr[hi]){
            return 0;
        }
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] > arr[mid+1]){
                return mid-lo+1;
            }else if(arr[mid] < arr[mid-1]){
                return mid-lo;
            }
            else{
                if(arr[lo] <= arr[mid]){
                    // left part sorted
                    lo = mid + 1;
                }else if(arr[mid+1] < arr[hi]){
                    hi = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findRotationCount(arr);
        System.out.println(ans);
    }
}