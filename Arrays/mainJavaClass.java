package Arrays;

import Arrays.Day1.swapAlternate;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static Arrays.Day1.sumOfArray.*;
import static Arrays.Day1.reverseArray.*;
import static Arrays.Day1.findUniqueEle.*;

public class mainJavaClass {
    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4,2};
//        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
//        int sum = sumOfArray(arr, arr.length);
//        System.out.println("The sum of array is: " + sum);
//
//        reverseArr(arr, arr.length);
//        printArr(arr, arr.length);

//        swapAlternate.reverseAlternate(arr, arr.length);
//        printArr(arr, arr.length);

//        int findUnique = findUniqueElements(arr, n);
//        System.out.println("The unique element is: " + findUnique);

//        int dupNumber = Arrays.Day2.duplicateInArray.dupInArray(arr, n);
//        System.out.println(dupNumber);

//        ArrayList<ArrayList<Integer>> result = Arrays.Day2.threeSum.findTripletSum(arr, n, 8);
//        printArrayList(result, result.size());

//        int binSearch = Arrays.Day2.binarySearchAlgorithm.binarySearch(arr, n, 5);
//        System.out.println("The element is found at index: " + binSearch);

//        System.out.println("Square root of a number is: " + Arrays.Day4.findSqrtOfNumber.mySqrt(8));

//        Arrays.Day5.selectionSort.selectionSortAlgo(arr, n);
        printArr(arr, n);
        Arrays.Day5.bubbleSort.bubbleSortAlgo(arr, n);
        printArr(arr, n);
    }

    private static void printArr(int arr[], int n){
        System.out.println("Printing the Array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void printArrayList(ArrayList<ArrayList<Integer>> arr, int size){
        System.out.println("the sum of Triples are: ");
        for(ArrayList<Integer> ele: arr){
            System.out.println(ele);
        }
    }
}
