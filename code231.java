public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;  // negative numbers and 0 are not powers of 2
        }
        
        return (n & (n - 1)) == 0;
    }
}