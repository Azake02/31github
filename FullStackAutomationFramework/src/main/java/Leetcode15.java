import java.util.Arrays;

public class Leetcode15 {
    public static void main(String[] args) {

        int  arr[] =  {1,2,3,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        if(nums.length==1){
            return nums[0];
        }
        for(i=0; i<nums.length-1; i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

