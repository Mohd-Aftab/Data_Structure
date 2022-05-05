import java.util.*;

public class Main {

	public static int solution(String s, int k){
	HashMap<Character, Integer> hm = new HashMap<>();
        int i=-1, j=-1, olen = 0;
        while(i < s.length() - 1){
            while(i < s.length() - 1){
                i++;
                char ch = s.charAt(i);
                int nf = hm.getOrDefault(ch, 0) + 1;
                hm.put(ch, nf);
                
                if(hm.size() == k){
                    olen = Math.max(olen, (i-j));
                }
                if(hm.size() > k){
                    // invalid ho gye 
                    break;
                }
                
            }
            while(j < i){
                j++;
                char ch = s.charAt(j);
                int nf = hm.get(ch);
                if(nf == 1){
                    // valid ho gye
                    hm.remove(ch);
                    break;
                }else{
                    nf = nf - 1;
                    hm.put(ch, nf);
                }
            }
        }
        return olen;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}