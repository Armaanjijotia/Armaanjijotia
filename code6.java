class Solution {
    public String convert(String s, int numRows) {

        // If only 1 row → no zigzag needed
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        // initialize each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean goingDown = false;

        // place each character
        for (int i = 0; i < s.length(); i++) {
            rows[row].append(s.charAt(i));

            // change direction when reaching top or bottom
            if (row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            }

            // move up or down
            row += goingDown ? 1 : -1;
        }

        // join all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb.toString());
        }

        return result.toString();
    }
}
