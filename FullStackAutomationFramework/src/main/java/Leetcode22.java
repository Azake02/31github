import java.util.Arrays;

public class Leetcode22 {
    public static void main(String[] args) {
        int[] num = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(num)));
    }

        public static int[] getConcatenation(int[] nums) {
            int n=nums.length;
            int [] ans = new int [n*2];
            for(int i=0; i<ans.length; i++){
                if(i<n){
                    ans[i]=nums[i];
                }
                else ans[i]=nums[i-n];
            }
            return ans;
        }
}
