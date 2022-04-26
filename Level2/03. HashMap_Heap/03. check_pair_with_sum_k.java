import java.util.*;

public class Main {
	
	public static void solution(int[] arr, int k){
		HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            int rem = ele % k;
            if(rem < 0){
                rem += k;
            }
            int nf = map.getOrDefault(rem, 0) + 1;
            map.put(rem, nf);
        }
        // System.out.println(map);
        for(int key : map.keySet()){
            if(key == 0){
                int count = map.get(key);
                if(count % 2 != 0){
                    System.out.println(false);
                    return;
                }
            }else{
                int nkey = k - key;
                if(!map.containsKey(nkey)){
                    System.out.println(false);
                    return;
                }else{
                    int c1 = map.get(key);
                    int c2 = map.get(nkey);
                    
                    if(c1 != c2){
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        System.out.println(true);

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		solution(arr,k);
	}

}  