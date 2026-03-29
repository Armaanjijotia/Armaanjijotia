import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // Use sorted string as key
            String key = new String(chars);

            // Add word to hashmap
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}