class Main {
    public static void main(String[] args) {
        int[] array = {-1, 2, -1, 5, 1, -6, -7, 9, -10};
        int maxSubarraySum = findMaxSubarraySum(array);
        System.out.print(maxSubarraySum);
    }

    public static int findMaxSubarraySum(int[] array) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; // Ensures correct handling of negative numbers

        for (int start = 0; start < array.length; start++) {
            currentSum = 0;
            for (int end = start; end < array.length; end++) {
                currentSum += array[end];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
