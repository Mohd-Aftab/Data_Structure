import java.io.*;
import java.util.*;

public class Main{
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
    
        // code
        int[] nsel = nextSmallerLeft(arr, n);
        int[] nser = nextSmallerRight(arr, n);
        int ma = 0;
        
        for(int i=0; i<n; i++){
            int area = (nser[i]-nsel[i]-1)*arr[i];
            ma = Math.max(area, ma);
        }
        System.out.println(ma);
        
    }
    
    public static int[] nextSmallerLeft(int arr[], int n){
        int res[] = new int[n];
        res[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1; i<n; i++){
            int ele = arr[i];
            while(st.size() > 0 && arr[st.peek()] >= ele){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
                st.push(i);
            }else{
                res[i] = st.peek();
                st.push(i);
            }
        }
        return res;
    }
    
    public static int[] nextSmallerRight(int arr[], int n){
        int res[] = new int[n];
        res[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            int ele = arr[i];
            while(st.size() > 0 && arr[st.peek()] >= ele){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = n;
                st.push(i);
            }else{
                res[i] = st.peek();
                st.push(i);
            }
        }
        return res;
    }
}