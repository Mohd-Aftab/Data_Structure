// 1. You are given an array(arr) which contains only 0's and 1's and a number K.
// 2. You have to find the maximum number of consecutive 1's in the given array if you can flip at most K zeroes.

import java.util.*;

public class Main {

    public static int solution(int[] arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i=-1, j=-1, ans=0, n=arr.length;
        while(i < n-1){
            while(i < n-1){
                i++;
                int ele = arr[i];
                int nf = hm.getOrDefault(ele, 0) + 1;
                if(ele == 0 && nf > k){
                    hm.put(ele, nf);
                    break;
                }else{
                    ans = Math.max(ans, (i - j));
                }
                hm.put(ele, nf);
            }
            while(j < i){
                j++;
                int ele = arr[j];
                int nf = hm.get(ele) - 1;
                if(ele == 0){
                    hm.put(ele, k);
                    break;
                }else{
                    if(nf == 0){
                        hm.remove(ele);
                    }else{
                        hm.put(ele, nf);
                    }
                }
            }
        }
        return ans;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr,k));
	}

}