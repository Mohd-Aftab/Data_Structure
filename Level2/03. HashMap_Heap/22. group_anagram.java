import java.util.*;

public class Main {
    public static String getKey(String s){
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[ch-'a'] += 1;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<26; i++){
            if(arr[i] > 0){
                char ch = (char)(i+'a');
                sb.append(ch + "" + arr[i]);                
            }
        }
        return sb.toString();
    }
	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            String key = getKey(str);
            ArrayList<String> list = hm.getOrDefault(key, new ArrayList<>());
            list.add(str);
            hm.put(key, list);
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for(String key : hm.keySet()){
            ans.add(hm.get(key));
        }
        return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		ArrayList<ArrayList<String>> anagramsGrouped = groupAnagrams(arr);
		for (ArrayList<String> lst : anagramsGrouped) {
			Collections.sort(lst);
		}
		anagramsGrouped.sort(new ListComparator());
		display(anagramsGrouped);
	}

	// it is used to make the result unique
	static class ListComparator implements Comparator<List<String>> {
		@Override
		public int compare(List<String> l1, List<String> l2) {
			if (l1.size() != l2.size()) {
				return l2.size() - l1.size();
			}

			String l1str = l1.get(0);
			String l2str = l2.get(0);
			return l1str.compareTo(l2str);

		}
	}

	public static void display(ArrayList<ArrayList<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> currList = list.get(i);
			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}
			System.out.println();
		}
	}

}