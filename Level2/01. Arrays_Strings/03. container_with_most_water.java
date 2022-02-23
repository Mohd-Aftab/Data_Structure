import java.util.*;

public class container_with_most_water {


    public static int mostWater(int[] heights) {
        int i=0, j=heights.length-1;
        int area = 0;
        while(i < j){
            if(heights[i] < heights[j]){
                int height = heights[i];
                int width = j - i;
                area = Math.max(area, (height*width));
                i++;
            }else{
                int height = heights[j];
                int width = j - i;
                area = Math.max(area, (height*width));
                j--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        int res = mostWater(heights);
        System.out.println(res);
    }
}
