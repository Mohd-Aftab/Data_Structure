import java.util.*;

public class square_of_sorted_array {


    public static int[] sortedSquares(int[] arr) {
        int res[] = new int[arr.length];
        int k = arr.length-1;
        int i=0, j=arr.length-1;
        while(i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                res[k] = arr[i]*arr[i];
                i++;
            }else{
                res[k] = arr[j]*arr[j];
                j--;
            }
            k--;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) 
            nums[i] = scn.nextInt();
        
        int[] res = sortedSquares(nums);

        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}