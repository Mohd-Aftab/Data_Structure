import java.util.*;

public class Main {

	public static int solution(String str, int k) {
		HashMap<Character, Integer> hm = new HashMap<>(); // char vs freq
	    int i=-1, j=-1, ans=0;
	    while(i < str.length()-1){
	        while(i < str.length()-1 && hm.size() <= k){
	            i++;
	            char ch = str.charAt(i);
	            int nf = hm.getOrDefault(ch, 0) + 1;
	            hm.put(ch, nf);
	            if(hm.size() <= k){
	                ans = Math.max(ans, (i - j));
	            }
	        }
	        while(j < i && hm.size() > k){
	            j++;
	            char ch = str.charAt(j);
	            int nf = hm.get(ch) - 1;
	            if(nf == 0){
	                hm.remove(ch);
	            }else{
	                hm.put(ch, nf);
	            }
	        }
	    }
	    return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}