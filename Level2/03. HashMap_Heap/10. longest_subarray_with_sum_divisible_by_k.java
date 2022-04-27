import java.util.*;

public class Main {

    public static int solution(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1); // rem 0 at -1 idx
        int ans = 0;
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
                ans = Math.max(ans, i - hm.get(rem));
            }else{
                hm.put(rem, i);
            }
        }
        // System.out.println(hm);
        return ans;
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
