package Arrays.Day3;

public class firstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurance = findFirstOccurance(nums, target);
        int lastOccurance = findLastOccurance(nums, target);

        int arr[] = new int[2];
        arr[0] = firstOccurance;
        arr[1] = lastOccurance;

        return arr;
    }

    private static int findFirstOccurance(int arr[], int target){
        int res = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                end = mid-1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return res;
    }

    private static int findLastOccurance(int arr[], int target){
        int res = -1;
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return res;
    }
}
