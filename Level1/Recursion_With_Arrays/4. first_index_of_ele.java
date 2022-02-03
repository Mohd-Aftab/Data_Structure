import java.io.*;
import java.util.*;

public class first_index_of_ele {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(firstIndex(arr, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){ // if not find in the whole array , return -1
            return -1;
        } 
        // first check if idx ele is == x .. if yes,, then it is first index of x
        if(arr[idx] == x){
            return idx;
        }
        // else check in the remaining arary(faith)
        int fi = firstIndex(arr, idx+1, x);
        return fi;
    }

}