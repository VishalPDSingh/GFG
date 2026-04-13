class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
         int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        if (secMax == Integer.MIN_VALUE)
            return -1;

        return secMax;
    }
}