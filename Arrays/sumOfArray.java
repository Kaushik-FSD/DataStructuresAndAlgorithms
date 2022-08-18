package Arrays;

public class sumOfArray {

    public static int sumOfArray(int arr[], int size){
        int sum = 0;
        for(int i = 0; i<size; i++)
            sum += arr[i];
        return sum;
    }
}
