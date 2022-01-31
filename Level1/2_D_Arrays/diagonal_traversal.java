import java.io.*;
import java.util.*;

public class diagonal_traversal {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        state_wakanda_2(arr, n);
    }
    
    public static void state_wakanda_2(int arr[][], int n){
        int k=0;
        while(k < n){
            for(int j=k; j<n; j++){
                for(int i=0; i<n; i++){
                    if(i+k == j){
                        System.out.println(arr[i][j]);
                    }
                }
            }
            k++;
        }
    }

}