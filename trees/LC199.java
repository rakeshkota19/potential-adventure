package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return ans;

        q.add(root);
        q.add(null);

        Integer prevValue = root.val;
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                ans.add(prevValue);

                if (!q.isEmpty())
                    q.add(null);

                continue;
            }

            prevValue = curr.val;

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }

        }

        return ans;
    }
}
