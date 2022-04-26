import java.util.*;
 
 public class Main {
 
     // This is a functional problem. You have to complete this function.
     // It takes as input an array and K.
     // It should return the length of maximum subarray whose sum is K. If no such subarray, return 0.
     public static int maxLenSubarray(int[] nums, int k) {
         // write your code here.
         HashMap<Integer, Integer> hm = new HashMap<>(); // sum vs index
         int sum = 0;
         int ans = 0;
         hm.put(0, -1);
         for(int i=0; i<nums.length; i++){
             int ele = nums[i];
             sum += ele;
             if(hm.containsKey(sum - k)){
                 ans = Math.max(ans, i-hm.get(sum-k));
             }
             if(!hm.containsKey(sum)){
                 hm.put(sum, i);
             }
         }
         return ans;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input for length of first array.
         int N = sc.nextInt();
 
         int[] arr1 = new int[N];
 
         // Input for array1 elements.
         for (int i = 0; i < arr1.length; i++) {
             arr1[i] = sc.nextInt();
         }
 
         int K = sc.nextInt();
 
         int result = maxLenSubarray(arr1, K);
 
         System.out.println(result);
 
     }
 
     // Function to display an array.
     public static void display(int[] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
 
         System.out.println();
     }
 
 }