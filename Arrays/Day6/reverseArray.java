package Arrays.Day6;

public class reverseArray {
    public static void reverseArray(int arr[], int n){
        int s = 0;
        int e = n-1;

        while(s <= e){
            Arrays.swapElements.swap(arr, s, e);
            s++;
            e--;
        }
    }
}
