import java.util.*;

public class Main {

    public static int solution(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int count = 0;
        int sum = 0;
        for(int i=0;i<n; i++){
            int ele = arr[i];
            sum += ele;
            int rem = sum % k;
            if(rem < 0){
                rem += k;
            }
            if(hm.containsKey(rem)){
                // answer creation step
                count += hm.get(rem);
                hm.put(rem, hm.get(rem)+1);
            }else{
                hm.put(rem, 1);
            }
        }
        // System.out.println(hm);
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }

}