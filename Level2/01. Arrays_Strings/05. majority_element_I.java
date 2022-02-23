import java.util.*;

public class majority_element_I {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static void printMajorityElement(int[] arr) {
        // write your code here
        int ele = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == ele){
                count++;
            }else{
                if(count == 0){
                    count = 1;
                    ele = arr[i];
                }else{
                    count--;
                }
            }
        }
        int freq = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ele){
                freq++;
            }
        }
        if(freq > (arr.length)/2){
            System.out.println(ele);
        }else{
            System.out.println("No Majority Element exist");
        }
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printMajorityElement(arr);
    }
}