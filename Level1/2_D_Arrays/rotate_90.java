import java.io.*;
import java.util.*;

public class rotate_90 {

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
        int res[][] = rotate90(arr, n);
        display(res);
    }
    public static int[][] rotate90(int arr[][], int n){
        int res[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                res[i][j] = arr[j][i];
            }
            res[i] = rev(res[i], n);
        }
        return res;
    }
    public static int[] rev(int arr[], int n){
        int i=0, j=n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}