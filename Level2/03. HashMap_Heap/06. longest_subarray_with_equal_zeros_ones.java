import java.util.*;

public class Main {

    public static int solution(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // gap vs index
        int c0 = 0;
        int c1 = 0;
        int ans = 0;
        hm.put(0, -1); // 0 gap at -1 index
        for(int i=0; i<nums.length; i++){
            int ele = nums[i];
            if(ele == 0){
                c0 += 1;
                int gap = c1 - c0;
                if(hm.containsKey(gap)){
                    // probable answer creation
                    ans = Math.max(ans, (i - hm.get(gap)));
                }else{
                    hm.put(gap, i);
                }
            }else if(ele == 1){
                c1 += 1;
                int gap = c1 - c0;
                if(hm.containsKey(gap)){
                    // probable answer creation
                    ans = Math.max(ans, (i - hm.get(gap)));
                }else{
                    hm.put(gap, i);
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
