import java.util.*;

public class Main {

	public static int solution(int[] arr) {
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
	    int count = 0;
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
	        int size = list.size();
	        count += (size*(size-1))/2;
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
