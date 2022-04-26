import java.util.*;

public class Main {
	
	public static int solution(int[] arr) {
	    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
	    int max = 0;
	    int sum = 0;
	    for(int i=0; i<arr.length; i++){
	        int ele = arr[i];
	        sum += ele;
	        ArrayList<Integer> list = hm.getOrDefault(sum, new ArrayList<>());
	        list.add(i);
	        hm.put(sum, list);
	    }
	    for(int key : hm.keySet()){
	        ArrayList<Integer> list = hm.get(key);
	        int n1 = list.get(0);
	        int n2 = list.get(list.size()-1);
	        max = Math.max(max, (n2-n1));
	    }
	    return max;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}