package Arrays.Day6;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != 0){
//                int temp = nums[j];
//                nums[j] = nums[i];
//                nums[i] = temp;
                Arrays.swapElements.swap(nums, j, i);
                i++;
            }
        }
    }
}