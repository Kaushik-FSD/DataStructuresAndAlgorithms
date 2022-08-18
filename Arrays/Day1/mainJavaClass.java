package Arrays.Day1;

import static Arrays.Day1.sumOfArray.*;
import static Arrays.Day1.reverseArray.*;
public class mainJavaClass {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int sum = sumOfArray(arr, arr.length);
        System.out.println("The sum of array is: " + sum);

        reverseArr(arr, arr.length);
        printArr(arr, arr.length);
    }

    private static void printArr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
