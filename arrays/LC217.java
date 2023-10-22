package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LC217 {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0 ; i < len ; i++) {
            if (numsSet.contains(nums[i])) {
                return true;
            }

            numsSet.add(nums[i]);
        }

        return true;
    }
}