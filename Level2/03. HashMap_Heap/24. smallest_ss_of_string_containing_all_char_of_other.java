import java.util.*;

public class Main {

	public static String solution(String s, String t){
		HashMap<Character, Integer> tmap = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            int nf = tmap.getOrDefault(ch, 0) + 1;
            tmap.put(ch, nf);
        }
        String ans = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        int mct = 0;
        int i=0, j=-1;
        while(i < s.length()){
             char ch = s.charAt(i);
            int nf = hm.getOrDefault(ch, 0)+1;
            hm.put(ch, nf);

            if(tmap.containsKey(ch)){
                if(hm.get(ch) <= tmap.get(ch)){
                    mct += 1;
                }
            }
            i++;
            if(mct == t.length()){
                while(mct == t.length()){
                    j++;
                    String cstr = s.substring(j, i);
                    if(ans.length() == 0){
                        ans = cstr;
                    }
                    else if(ans.length() > cstr.length()){
                        ans = cstr;
                    }
                    char x = cstr.charAt(0);
                    int freq = hm.get(x) - 1;
                    hm.put(x, freq);
                    if(tmap.containsKey(x)){
                        if(hm.get(x) < tmap.get(x)){
                            mct -= 1;
                        }
                    }
                }
            }  
        } 
        return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}