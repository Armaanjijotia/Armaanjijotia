class tosum {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        // First loop
        for (int i = 0; i < nums.length; i++) {

            // Second loop
            for (int j = i + 1; j < nums.length; j++) {

                // Check if sum is equal to target
                if (nums[i] + nums[j] == target) {

                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result; // given that one solution always exists
    }
}
