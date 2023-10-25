package trees;

public class LC1448 {
    public int func(TreeNode root, int level, int maxValue) {
        if (root == null)
            return 0;

        int ans = 0;

        if (root.val >= maxValue)
            ans++;

        maxValue = Math.max(maxValue, root.val);
        ans += func(root.left, level+1, maxValue);
        ans += func(root.right, level+1, maxValue);
        return ans;
    }


    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;

        return func(root, 0, root.val);
    }
}
