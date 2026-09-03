class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 != 0) {
                minOdd = Math.min(minOdd, num);
            } else {
                minEven = Math.min(minEven, num);
            }
        }

        // Case 1: All numbers are already even (No odd numbers exist)
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // Case 2: We can make all numbers odd if minOdd is smaller than minEven
        return minOdd < minEven;
    }
}