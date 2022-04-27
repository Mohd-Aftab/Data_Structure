import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        HashMap<String, Integer> hm = new HashMap<>(); // (c0-c1)@(c1-c2) vs count
        int c0=0;
        int c1 = 0;
        int c2 = 0;
        hm.put("0@0", 1);
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                c0++;
            }else if(arr[i] == 1){
                c1++;
            }else{
                c2++;
            }
            
            String state = (c0-c1) + "@" + (c1 - c2);
            if(hm.containsKey(state)){
                ans += hm.get(state);
            }
            int c = hm.getOrDefault(state, 0) + 1;
            hm.put(state, c);
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