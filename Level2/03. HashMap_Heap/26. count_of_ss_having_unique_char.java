import java.util.*;

public class Main {

	public static int solution(String str) {
		int count = 0;
		HashMap<Character, Integer> hm = new HashMap<>();
		int i=-1, j=-1;
		while(i < str.length() - 1){
		    while(i < str.length() - 1){
		        i++;
		        char ch = str.charAt(i);
		        int nf = hm.getOrDefault(ch, 0) + 1;
		        hm.put(ch, nf);
		        if(nf == 2){
		            break;
		        }
		        else{
		            count += (i-j);
		        }
		    }
		    while(j < i){
		        j++;
		        char ch = str.charAt(j);
		        int nf = hm.get(ch);
		        if(nf == 1){
		            hm.remove(ch);
		        }
		        else{
		            hm.put(ch, 1);
		            count += (i-j);
		            break;
		        }
		    }
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}   