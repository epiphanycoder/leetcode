package leetcode.opu.practice;

import java.util.ArrayList;
import java.util.List;
// 39. Combination Sum
public class CombinationSum_I {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        findCombo(candidates, 0, target, new ArrayList(), result);
        return result;
    }

    private void findCombo(int[] cand, int start, int target, List<Integer> list, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList(list));
            return;
        }

        for (int i = start; i < cand.length; i++) {
            if (i == start || cand[i] != cand[i - 1]) {
                list.add(cand[i]);
                findCombo(cand, i, target - cand[i], list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
