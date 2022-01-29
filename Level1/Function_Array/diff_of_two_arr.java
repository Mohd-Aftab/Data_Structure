import java.io.*;
import java.util.*;

public class diff_of_two_arr{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }
        
        int res[] = diffOfArray(arr1, n1, arr2, n2);
        int x = 0;
        if(res[0] == 0){
            x = 1;
        }
        for(int i=x; i<res.length; i++){
            System.out.println(res[i]);
        }
    }

    public static int[] diffOfArray(int arr1[], int n1, int arr2[], int n2){
        int i=n1-1, j=n2-1, borrow = 0;
        int res[] = new int[n2];
        int x = j;
        while(i >= 0 || j >= 0){
            int v1 = arr2[j];
            int v2 = i >= 0 ? arr1[i] : 0;
            if(borrow == 1){
                v1 -= 1;
                borrow = 0;
            }
            if(v1 < v2){
                v1 += 10;
                borrow = 1;
            }
            int diff = v1 - v2;
            res[x] = diff;
            x--; i--; j--;
        }
        return res;
    }

}