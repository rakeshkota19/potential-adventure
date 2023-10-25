package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return ans;

        q.add(root);
        q.add(null);

        List<Integer> currList = new ArrayList<>();
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                ans.add(new ArrayList<>(currList));
                currList.clear();

                if (!q.isEmpty())
                    q.add(null);

                continue;
            }

            currList.add(curr.val);

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
