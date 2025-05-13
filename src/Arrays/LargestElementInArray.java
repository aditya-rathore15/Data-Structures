package Arrays;

/*
Given an array of integers nums, return the value of the largest element in the array
 */
public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,3,9};
        int n = arr.length-1;
        findLargest(arr, n);
    }

    public static void findLargest(int[] arr, int n) {
        int largest = -1;
        int secondLargest = -1;

        for(int i =0; i<=n; i++) {                   // i =4
            if(arr[i] > largest) {                  // 9>5
                secondLargest = largest;            // sl = 5
                largest = arr[i];                   // l = 9
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element: "+ largest);
        System.out.println("Second largest element: "+secondLargest);
    }
}
