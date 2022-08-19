package Arrays.Day2;

public class duplicateInArray {
    public static int dupInArray(int arr[], int n){
        //here we have to find that element which is repeating twice.
        //The elements of array are from 1 to n-1;
        //Eg: arr -> 1,2,3,4,2
        //o/P -> 2

        /*
        we can easily do it in nested for loops, but we can use XOR to do so.
        Basically we will xor all array elements, and once done we will xor 1 to n-1 with the XORed result.
        Thus, we are doing xor of each element twice so that the result becomes zero.
        and since xor with the same elements will give 0 but the remaining extra element will remain.
        So in this way we can get our result.

        Eg: ans = 1^2^3^4^2 = x
            for(i = 1 to n-1) -> i ^ ans = the duplicate number(2)
         */

        int ans = 0;
        for(int i = 0; i<n; i++){
            ans = ans^arr[i];
        }

        for(int i = 1; i<n; i++){
            ans = i^ans;
        }

        return ans;
    }
}
