public class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long low = 1;
        long high = x;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid == x) {
                return (int) mid;
            }

            if (mid * mid < x) {
                ans = mid;       // store possible answer
                low = mid + 1;   // search right
            } else {
                high = mid - 1;  // search left
            }
        }

        return (int) ans;
    }
}