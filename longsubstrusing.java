class longsubstring {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        // pick starting point
        for (int i = 0; i < s.length(); i++) {

            boolean[] visited = new boolean[256];
            int currentLength = 0;

            // check substring starting from i
            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                // if character already seen, break
                if (visited[ch]) {
                    break;
                }

                visited[ch] = true;
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
        }

        return maxLength;
    }
}
