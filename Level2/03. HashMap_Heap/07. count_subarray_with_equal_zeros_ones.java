import java.util.*;

public class Main {

    public static int solution(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // gap vs index
        int c0 = 0;
        int c1 = 0;
        int count = 0;
        hm.put(0, 1); // 0 gap count 1
        for(int i=0; i<nums.length; i++){
            int ele = nums[i];
            if(ele == 0){
                c0 += 1;
                int gap = c1 - c0;
                if(hm.containsKey(gap)){
                    // probable answer creation
                    int nf = hm.get(gap);
                    count += nf;
                    nf += 1;
                    hm.put(gap, nf);
                }else{
                    hm.put(gap, 1);
                }
            }else if(ele == 1){
                c1 += 1;
                int gap = c1 - c0;
                if(hm.containsKey(gap)){
                    // probable answer creation
                    int nf = hm.get(gap);
                    count += nf;
                    nf+=1;
                    hm.put(gap, nf);
                }else{
                    hm.put(gap, 1);
                }
            }
        }
        return count;
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