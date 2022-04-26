import java.util.*;

public class Main {

	public static int solution(int[] nums, int k){
		HashMap<Integer, Integer> hm = new HashMap<>(); // sum vs index
        hm.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int ele = nums[i];
            sum += ele;
            int gap = sum - k;
            if(hm.containsKey(gap)){
                // probable answer
                count += hm.get(gap);
            }
            if(!hm.containsKey(sum)){
                hm.put(sum, 1);
            }else{
                hm.put(sum, hm.get(sum)+1);
            }
        }
        return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(solution(arr,target));
	}

}
