import java.io.*;
import java.util.*;

public class Main {

    public static int maximalRectangle(int[][] a) {  
        int area = 0;
        int[] arr = new int[a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j] == 0) {
                    arr[j] = 0;
                }
                else {
                    arr[j] += 1;
                }
            }
            int ma = largest(arr, arr.length);
            area = Math.max(area, ma);
        }
        return area;
    }
    
    public static int largest(int arr[], int n){
        int[] nsel = nextSmallerLeft(arr, n);
        int[] nser = nextSmallerRight(arr, n);
        int ma = 0;
        
        for(int i=0; i<n; i++){
            int area = (nser[i]-nsel[i]-1)*arr[i];
            ma = Math.max(area, ma);
        }
        return ma;
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

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(read.readLine());
        int col = Integer.parseInt(read.readLine());
        
        int bmat[][] = new int[row][col];

        for(int i=0;i<row;i++){
            String s = read.readLine();
            for(int j=0;j<col;j++){
                bmat[i][j] = s.charAt(j)-'0';
            }
        }

        int result = maximalRectangle(bmat);
        System.out.println(result);
        
    }
}