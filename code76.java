import java.util.*;

public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> map = new HashMap<>();

        // Count characters of t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int required = map.size(); // unique chars needed
        int formed = 0;

        Map<Character, Integer> windowCounts = new HashMap<>();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            // Check if current char fulfills requirement
            if (map.containsKey(c) && 
                windowCounts.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

            // Try shrinking window
            while (left <= right && formed == required) {
                char ch = s.charAt(left);

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove from window
                windowCounts.put(ch, windowCounts.get(ch) - 1);

                if (map.containsKey(ch) && 
                    windowCounts.get(ch) < map.get(ch)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" 
               : s.substring(start, start + minLen);
    }
}