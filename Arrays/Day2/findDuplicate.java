package Arrays.Day2;

import java.util.*;

public class findDuplicate {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();

        //Method 1: O(n) -> space and time
        // HashMap<Integer, Integer> hm = new HashMap
        // for(int i:nums){
        //     hm.put(i, hm.getOrDefault(i, 0) + 1);
        // }
        // for(int k : hm.keySet()){
        //     if(hm.get(k)==2)
        //         ans.add(k);
        // }

        /*
        2nd Apporach-> O(n) time, O(1) space
        we will iterate over the array and for every element we will go to its index.
        Eg: the first element is let say 4 in the array then we'll go to the 4th index of the array
        NOTE: we're iterating the array with index as 1 to n
        and once we reach that index we will make it as a negative number. So for every uniwue element
        it will work fine but when we will find any duplicate then the index will already be negative. So
        if the index is already negative then we will add that to output array.

        NOTE:  we are making the index as nums[i] -1 because to make sure the array do not go out of bound.
        */

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                ans.add(index + 1);
            nums[index] = -nums[index];
        }

        return ans;
    }
}
