import java.io.*;
import java.util.*;

public class largest_area_histogram{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
        int lh[] = new int[n];
        int rh[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rh[arr.length-1] = arr.length;
        
        for(int i=arr.length-2; i>=0; i--){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rh[i] = arr.length;
            }else{
                rh[i] = st.peek();
            }
            st.push(i);
        }
        
        st = new Stack<>();
        st.push(0);
        lh[0] = -1;
        
        for(int i=1; i<arr.length; i++){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                lh[i] = -1;
            }else{
                lh[i] = st.peek();
            }
            st.push(i);
        }
        
        int max_area = 0;
        for(int i=0; i<n; i++){
            int width = rh[i] - lh[i] - 1;
            int area = width * arr[i];
            if(area > max_area){
                max_area = area;
            }
        }
        System.out.println(max_area);
        
    }
}