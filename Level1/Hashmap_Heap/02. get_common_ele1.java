import java.io.*;
import java.util.*;

public class get_common_ele1{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int ele : arr1){
            if(hm.containsKey(ele) == false){
                hm.put(ele, true);
            }else{
                hm.put(ele, true);
            }
        }
        
        for(int ele : arr2){
            if(hm.containsKey(ele) && hm.get(ele) == true){
                System.out.println(ele);
                hm.put(ele, false);
            }
        }
    }

}