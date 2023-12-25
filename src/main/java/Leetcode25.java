public class Leetcode25 {
    public static void main(String[] args) {
<<<<<<< HEAD

    }


        public static int removeElement(int[] nums, int val)
        {
            int n=nums.length;
            int k=0;
            for(int i=0; i<n; i++)
            {
                if(nums[i] != val)
                {
                    nums[k]=nums[i];
=======
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
>>>>>>> cbfbf02dd6328d2515caf47dab295a12737a8fc3
                    k++;
                }
            }
            return k;
        }
    }

