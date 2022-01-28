import java.io.*;
import java.util.*;

public class bar_chart{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        barChart(arr, n);
    }
    public static void barChart(int arr[], int n){
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int floor=max; floor>=1; floor--){
            for(int i=0; i<n; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}