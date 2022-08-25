package Arrays.Day7;

public class rotateArray {
//    Given an array, rotate the array to the right by k steps, where k is non-negative.
    public static void rotate(int[] nums, int k) {
            /*
            We can use 2 for loops to rotate the array but that is not optimized -> O(k*n)
            */

        //Efficient approach
        int arr[] = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            arr[(i+k)%nums.length] = nums[i];
        }

        for(int i = 0; i<arr.length; i++){
            nums[i] = arr[i];
        }

    }
}
