import java.util.*;

public class Main {

    public static int solution(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i=-1, j=-1, ans=0, n=arr.length;
        while(i < n-1){
            while(i < n-1){
                i++;
                int ele = arr[i];
                int nf = hm.getOrDefault(ele, 0) + 1;
                if(ele == 0 && nf == 2){
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
                    hm.put(ele, 1);
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
        System.out.println(solution(arr));
	}

}