package recursion;

import java.util.ArrayList;
import java.util.List;

public class LC39 {
    void func(int index, int[] candidates, int target,
              List<Integer> curr,
              List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || index >= candidates.length)
            return;


        curr.add(candidates[index]);
        func(index, candidates, target - candidates[index], curr, ans);
        curr.remove(curr.size() - 1);


        func(index+1, candidates, target, curr, ans);
        return;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<Integer>();
        func(0, candidates, target, curr, ans);
        return ans;
    }
}
