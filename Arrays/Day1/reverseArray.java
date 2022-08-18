package Arrays.Day1;

public class reverseArray {

    public static void reverseArr(int arr[], int n){
        int first = 0;
        int end = n-1;

        while(first < end){
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;
        }
    }
}
