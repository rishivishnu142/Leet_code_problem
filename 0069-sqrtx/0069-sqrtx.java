class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2; // The square root of x (for x >= 4) is always <= x / 2
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use division (x / mid) instead of (mid * mid) to prevent integer overflow
            if (mid <= x / mid) {
                ans = mid;     // mid is a valid floor square root, try searching higher
                left = mid + 1;
            } else {
                right = mid - 1; // mid * mid > x, search lower
            }
        }

        return ans;
    }
}