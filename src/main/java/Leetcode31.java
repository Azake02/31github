import java.util.ArrayList;
import java.util.List;

public class Leetcode31 {
    public static void main(String[] args) {
        int nums[] = {1,3};
        int nums2[] = {2};
        System.out.println(findMedianSortedArrays(nums,nums2));

    }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Integer> lt = new ArrayList<>();
            for(int num : nums1){
                lt.add(num);
            }

            for(int num:nums2){
                lt.add(num);
            }

            lt.sort(null);

            int size = lt.size();


            if(size%2!=0){
                int mid = lt.get(size/2);
                return mid;
            }
            else{
                int mid1 = lt.get(size / 2 - 1);
                int mid2 = lt.get(size / 2);
                return (mid1 + mid2) / 2.0;
            }

        }

}
