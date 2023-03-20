
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    static int sum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    static double average(int[][] arr){
        double sum = sum(arr);
        return sum/(arr.length*arr.length);
    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    static int minimum(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j]<min) min=arr[i][j];
            }
        }
        return min;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    static int maximum(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j]>max) max=arr[i][j];
            }
        }
        return max;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    static int evenCountStandard(int[][] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j]%2==0) ans++;
            }
        }
        return ans;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    static int evenCountEnhanced(int[][] arr){
        int ans = 0;
        for (int i[] : arr){
            for (int j : i){
                if(j%2==0) ans++;
            }
        }
        return ans;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    static boolean allPositive(int[][] arr){
        for (int i[] : arr){
            for (int j : i){
                if(j<0) return false;
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    static int[] rowSums(int[][] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                ans[i]+=arr[i][j];
            }
        }
        return ans;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    static int[] colSums(int[][] arr){
        int[] ans = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                ans[i]+=arr[j][i];
            }
        }
        return ans;
    }
}
