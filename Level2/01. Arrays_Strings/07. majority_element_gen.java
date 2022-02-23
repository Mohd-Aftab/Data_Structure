import java.util.*;

public class majority_element_gen {

    public static ArrayList<Integer> majorityElement(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // integer vs count
        for(int ele : arr){
            int nf = hm.getOrDefault(ele, 0) + 1;
            hm.put(ele, nf);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key : hm.keySet()){
            int freq = hm.get(key);
            if(freq > (arr.length)/k){
                ans.add(key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        ArrayList<Integer> res = majorityElement(arr, k);
        System.out.println(res);
    }
}