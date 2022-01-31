import java.io.*;
import java.util.*;

public class ring_rotate {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int k = scn.nextInt();  
        int one[] = oneDExtract(arr, n, m, s);
        rotate(one, k);
        
        int twoD[][] = twoDbuild(arr, one, s);
        display(arr);
    }
    public static int[] oneDExtract(int arr[][], int n, int m, int s){
        int ne = (2 * (m - (2*s -2))) + 2*(n - (2*s));
        int a[] = new int[ne];
        int minr = s-1, maxr = n-s, minc = s-1, maxc = m-s;
        int k=0;
        // Left wall
        for(int i=minr, j=minc; i<=maxr; i++){
            a[k] = arr[i][j];
            k++;
        }
        minc++;
        // Bottom wall
        for(int j=minc, i=maxr; j<=maxc; j++){
            a[k] = arr[i][j];
            k++;
        }
        maxr--;
        // Right wall
        for(int i=maxr, j=maxc; i>=minr; i--){
            a[k] = arr[i][j];
            k++;
        }
        maxc--;
        // top wall
        for(int j=maxc, i=minr; j>=minc; j--){
            a[k] = arr[i][j];
            k++;
        }
        minr++;
        return a;
    }

    private static void swap(int arr[], int i,int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    private static void reverse(int arr[], int x, int y){
      int i=x, j=y;
      while(i < j){
          swap(arr, i, j);
          i++;
          j--;
      }
    }
    public static void rotate(int[] arr, int k){
      int n = arr.length; 
      k = k % n;
      if(k < 0){
          k += n;
      }
      reverse(arr, n-k, n-1);
      reverse(arr, 0, n-k-1);
      reverse(arr, 0, n-1);
    }

    public static int[][] twoDbuild(int arr[][], int a[], int s){
        int l = a.length;
        int n = arr.length;
        int m = arr[0].length;
        int minr = s-1, maxr = n-s, minc = s-1, maxc = m-s;
        int k=0;
        // Left wall
        for(int i=minr, j=minc; i<=maxr && k<l; i++){
            arr[i][j] = a[k];
            k++;
        }
        minc++;
        // Bottom wall
        for(int j=minc, i=maxr; j<=maxc && k<l; j++){
            arr[i][j] = a[k];
            k++;
        }
        maxr--;
        // Right wall
        for(int i=maxr, j=maxc; i>=minr && k<l; i--){
            arr[i][j] = a[k];
            k++;
        }
        maxc--;
        // top wall
        for(int j=maxc, i=minr; j>=minc && k<l; j--){
            arr[i][j] = a[k];
            k++;
        }
        minr++;
        return arr;
        
    }




    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}