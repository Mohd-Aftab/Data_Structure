import java.io.*;
import java.util.*;

public class get_common_ele2{

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
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele : arr1){
            if(hm.containsKey(ele) == false){
                hm.put(ele, 1);
            }else{
                int nf = hm.get(ele) + 1;
                hm.put(ele, nf);
            }
        }
        for(int ele : arr2){
            if(hm.containsKey(ele) && hm.get(ele) > 0){
                System.out.println(ele);
                int nf = hm.get(ele) - 1;
                hm.put(ele, nf);
            }
        }
    }

}