import java.io.*;
import java.util.*;

public class display_array {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        displayArr(arr, 0);
    }
    
    // Display array from left to right
    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]); // printing idx element
        displayArr(arr, idx+1); // faith that recusion will print idx+1 all elements
    }

}