import java.util.*;

public class Main {
	public static int[] anagramMappings(int[] arr1, int[] arr2) {
		HashMap<Integer, ArrayDeque<Integer>> hm =new HashMap<>();
		for(int i=0; i<arr2.length; i++){
		    if(hm.containsKey(arr2[i])){
		        ArrayDeque<Integer> list = hm.get(arr2[i]);
		        list.add(i);
		        hm.put(arr2[i], list);
		    }else{
		        ArrayDeque<Integer> list = new ArrayDeque<>();
		        list.add(i);
		        hm.put(arr2[i], list);
		    }
		}
		int res[] = new int[arr1.length];
		int k = 0;
		for(int i=0; i<arr1.length; i++){
		    int ele = arr1[i];
		    if(hm.containsKey(ele)){
		        ArrayDeque<Integer> list = hm.get(ele);
		        int idx = list.peek();
		        res[i] = idx;
		        list.remove();
		        hm.put(ele, list);
		    }
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = s.nextInt();
		}
		int[] res = anagramMappings(a, b);
		for (int j = 0; j < res.length; j++) {
			System.out.print(res[j] + " ");
		}
	}

}