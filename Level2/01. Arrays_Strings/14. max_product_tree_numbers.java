import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~
    public static int maximumProduct(int[] arr) {
        // write your code here
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                max3 = max2;
                max2 = arr[i];
            }else if(arr[i] > max3){
                max3 = arr[i];
            }
            
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }else  if(arr[i] < min2){
                min2 = arr[i];
            }
        }
        
        int maxPro = Math.max((max1*max2*max3), (min1*min2*max1));
        return maxPro;
    }

    // ~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int prod = maximumProduct(arr);
        System.out.println(prod);
    }
}   