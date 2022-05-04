import java.util.*;

public class Main {

	public static int solution(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
        int i=-1, j=-1;
        int olen = 0;
        while(i < s.length() - 1){
            while(i < s.length() - 1){
                i++;
                char ch = s.charAt(i);
                int nf = hm.getOrDefault(ch, 0) + 1;
                hm.put(ch, nf);
                if(nf == 2){
                    break;
                }else{
                    int len = i - j;
                    olen = Math.max(olen, len);
                }
            }
            while(j < i){
                j++;
                char ch = s.charAt(j);
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    // valid again 
                    hm.put(ch, 1);
                    break;
                }
            }
        }
        return olen;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}