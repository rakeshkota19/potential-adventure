package recursion;

import java.util.ArrayList;
import java.util.List;

public class LC22 {
    void func(int left, int right, int total, String curr, List<String> ans) {
        if (right > left)
            return;

        if (left + right == total) {
            if (left > right)
                return;

            ans.add(curr);
            return;
        }


        func(left+1, right, total, curr + '(', ans);

        if (left>right)
            func(left, right + 1, total, curr + ')', ans);

        return;
    }


    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String tmp = "";
        func(0,0,2*n,tmp,ans);
        return ans;
    }
}
