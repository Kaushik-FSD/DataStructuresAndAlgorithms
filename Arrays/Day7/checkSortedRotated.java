package Arrays.Day7;

public class checkSortedRotated {
    //link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 1; i<n; i++){
            if(nums[i-1] > nums[i]){
                count++;
            }
        }

        if(nums[n-1] > nums[0]){
            count++;
        }

        return count<=1;
    }
}
