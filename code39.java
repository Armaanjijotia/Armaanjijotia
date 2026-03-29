import java.util.*;

class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> current, List<List<Integer>> result) {
        
        // If target becomes 0, we found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            
            // If candidate is greater than remaining target, skip
            if (candidates[i] > target)
                continue;
            
            // Choose the number
            current.add(candidates[i]);
            
            // Call recursively (i not i+1 because repetition allowed)
            backtrack(candidates, target - candidates[i], i, current, result);
            
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}