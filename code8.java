class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;

        // 1. Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Process digits
        while (i < s.length()) {
            char ch = s.charAt(i);

            // Stop if not a digit
            if (ch < '0' || ch > '9') break;

            int digit = ch - '0';

            // 4. Overflow check BEFORE adding
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
