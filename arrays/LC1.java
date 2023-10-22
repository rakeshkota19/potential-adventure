package arrays;

import java.util.HashMap;
import java.util.Map;

class LC1 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0 ; i < len ; i++) {
            int num = nums[i];
            int k = target - num;

            if (numsMap.containsKey(k)) {
                return new int[]{numsMap.get(k), i};
            }

            numsMap.put(num, i);
        }


        return new int[]{};
    }
}