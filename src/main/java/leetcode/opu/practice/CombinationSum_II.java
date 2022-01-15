package leetcode.opu.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 40. Combination Sum II
public class CombinationSum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<Integer>(), output);
        return output;
    }

    private void backtrack(int[] cand, int start, int target, List<Integer> list, List<List<Integer>> output) {
        if (target < 0) {
            return;
        }
        // solution
        if (target == 0) {
            output.add(new ArrayList(list));
            return;
        }

        for (int i = start; i < cand.length; i++) {
            if (i == start || cand[i] != cand[i - 1]) {
                list.add(cand[i]);
                backtrack(cand, i + 1, target - cand[i], list, output);
                list.remove(list.size() - 1);
            }
        }
    }

}
