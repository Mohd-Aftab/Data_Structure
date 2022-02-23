import java.util.*;

public class majority_ele_II {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~
    public static ArrayList<Integer> majorityElement2(int[] nums) {
        // write your code here
        int e1 = nums[0];
        int c1 = 1;
        int e2 = 0;
        int c2 = 0;
        for(int i=1; i<nums.length; i++){
            int ele = nums[i];
            if(ele == e1){
                c1++;
            }else if(ele == e2){
                c2++;
            }else{
                if(c1 == 0){
                    c1 = 1;
                    e1 = nums[i];
                }else if(c2 == 0){
                    c2 = 1;
                    e2 = nums[i];
                }else{
                    c1--;
                    c2--;
                }
            }
        }
        int f1 = 0;
        int f2 = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nums){
            if(ele == e1){
                f1++;
            }else if(ele == e2){
                f2++;
            }
        }
        if(f1 > (nums.length)/3){
            ans.add(e1);
        }
        if(f2 > (nums.length)/3){
            ans.add(e2);
        }
        return ans;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> res = majorityElement2(arr);
        System.out.println(res);
    }
}