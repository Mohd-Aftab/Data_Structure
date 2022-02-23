import java.util.*;

public class product_excepyt_self {
    
    //~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
    public static int[] productExceptSelf(int[] arr) {
        // write your code here
        int left[] = new int[arr.length];
        left[0] = arr[0];
        int right[] = new int[arr.length];
        right[arr.length-1] = arr[arr.length-1];
        for(int i=1; i<arr.length; i++){
            left[i] = arr[i]*left[i-1];
        }
        for(int i=arr.length-2; i>=0; i--){
            right[i] = arr[i]*right[i+1];
        }
        int res[] = new int[arr.length];
        res[0] = right[1];
        res[arr.length-1] = left[arr.length-2];
        for(int i=1; i<arr.length-1; i++){
            res[i] = left[i-1]*right[i+1];
        }
        return res;
    }

    //~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = productExceptSelf(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}