package Arrays.Day3;

public class findPivotElement {
    public int pivotIndex(int[] nums) {

        int pre[] = new int[nums.length];
        int suf[] = new int[nums.length];
        pre[0] = nums[0];
        suf[nums.length-1] = nums[nums.length-1];

        //filling the prefix array
        for(int i = 1; i<pre.length; i++){
            pre[i] = pre[i-1] + nums[i];
        }

        //filling the suffix array
        for(int i = nums.length-2; i>=0; i--){
            suf[i] = suf[i+1] + nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            if(pre[i] == suf[i]){
                return i;
            }
        }

        return -1;
    }
}
