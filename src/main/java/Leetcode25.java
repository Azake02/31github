public class Leetcode25 {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int num=3;
        System.out.println(removeElement(nums, num));
    }
        public static int removeElement ( int[] nums, int val){
            int n = nums.length;
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }

