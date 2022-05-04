import java.util.*;

public class Main {
	
    public static void completeTask(int n, int m, int[] arr) {
		// write your code here
		HashSet<Integer> set = new HashSet<>();
		for(int ele : arr){
		    set.add(ele);
		}
		boolean flag = true;
		ArrayList<Integer> s1 = new ArrayList<>();
		ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                if(flag == true){
                    s1.add(i);
                    flag = false;
                }else{
                    s2.add(i);
                    flag = true;
                }
            }
        }
        for(Integer ele : s1){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(Integer ele : s2){
            System.out.print(ele + " ");
        }
        System.out.println();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] num = new int[m];
		for (int i = 0; i < m; i++) {
			num[i] = scn.nextInt();
		}
		completeTask(n, m, num);
	}

}