import java.io.*;
import java.util.*;

public class find_element{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        System.out.println(findEle(arr, n, tar));
    }
    public static int findEle(int arr[], int n, int tar){
        for(int i=0; i<n; i++){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }

}