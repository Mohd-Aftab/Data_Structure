import java.io.*;
import java.util.*;

public class display_array_rev {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        displayArrReverse(arr, 0);
    }
    
    // Display array from left to right
    public static void displayArrReverse(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        displayArrReverse(arr, idx+1); // faith that recusion will print idx+1 all elements
        System.out.println(arr[idx]); // printing idx element
    }

}