import java.io.*;
import java.util.*;

public class Main {
    public static int[] nextGreaterElementII(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
        Stack<Integer> st = new Stack<>();
        for(int i=n-2; i>=0; i--){
            max = Math.max(max, arr[i]);
            if(arr[i] > arr[n-1]){
                st.push(arr[i]);
            }
        }
        int[] res= new int[n];
        for(int i=n-1; i>=0; i--){
            int ele = arr[i];
            while(st.size() > 0 && st.peek() <= ele){
                st.pop();
            }
            if(st.size() == 0){
                st.push(ele);
                res[i] = -1;
            }else{
                res[i] = st.peek();
                st.push(ele);
            }
        }
        return res;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(read.readLine());
        }
        
        int ans[] = nextGreaterElementII(nums);

        n = ans.length;

        System.out.println(n);
        for(int e: ans){
            System.out.println(e);
        }
        
    }
}