package recursion;

import java.util.ArrayList;
import java.util.List;

public class LC78 {
    void func(int[] nums, int index,
              List<Integer> currList,
              List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(currList));
            return;
        }

        func(nums, index+1, currList, ans);
        currList.add(nums[index]);
        func(nums, index+1, currList, ans);
        currList.remove(currList.size() - 1);
        return;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        func(nums, 0, tmp, ans);
        return ans;
    }
}
