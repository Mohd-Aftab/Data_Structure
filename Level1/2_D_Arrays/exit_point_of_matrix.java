import java.io.*;
import java.util.*;

public class exit_point_of_matrix {

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
        int i=0, j=0;
        int dir = 0;
        while(true){
            dir = dir + arr[i][j];
            dir %= 4;
            if(dir == 0){
                j++;
            }else if(dir == 1){
                i++;
            }else if(dir == 2){
                j--;
            }else if(dir == 3){
                i--;
            }
            if(i == -1){
                i++;break;
            }else if(i == n){
                i--; break;
            }else if(j == -1){
                j++;break;
            }else if(j == m){
                j--; break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

}