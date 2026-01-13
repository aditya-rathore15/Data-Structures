package prefixsum.basics;

public class SumOfAllOddLengthSubarray {
    public static int sumOddLengthSubarray(int[] arr) {
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if((j-i+1)%2 !=0) {
                    for(int k=i; k<=j; k++) {
                        sum += arr[k];
                    }
                }
            }
        }

        return sum;
    }

    public static int sumOddLengthSubarray2(int[] arr) {
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            int runningSum = 0;
            for(int j=i; j<arr.length; j++) {
                runningSum = runningSum + arr[j];
                if((j-i+1)%2!=0) {
                    sum += runningSum;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarray(arr));
        System.out.println(sumOddLengthSubarray2(arr));
    }
}