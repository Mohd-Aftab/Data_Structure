import java.io.*;
import java.util.*;

public class sum_of_two_array{

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
        
        int res[] = sumOfArrays(arr1, arr2, n1, n2);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
    
    public static int[] sumOfArrays(int arr1[], int arr2[], int n1, int n2){
        int i=n1-1, j=n2-1;
        int res[] = new int[n1 > n2 ? n1 : n2];
        int k = res.length-1;
        int carry = 0;
        while(i >= 0 || j>= 0){
            int d1 = i >= 0 ? arr1[i] : 0;
            int d2 = j >= 0 ? arr2[j] : 0;
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            res[k] = sum % 10;
            k--;
            j--;
            i--;
        }
        if(carry != 0){
            int[] newArr = new int[res.length + 1];
            newArr[0] = carry;
            for(int l=0; l<res.length; l++){
                newArr[l+1] = res[l];
            }
            res = newArr;
        }
        return res;
    }

}