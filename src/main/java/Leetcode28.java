import java.util.Arrays;

public class Leetcode28 {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }
        public static int heightChecker(int[] heights) {
            int[] expected_Heights = heights.clone();
            Arrays.sort(expected_Heights);

            int count = 0;
            for(int i = 0; i < heights.length; i++){
                if(heights[i] != expected_Heights[i]){
                    count++;
                }
            }
            return count;
        }
}
