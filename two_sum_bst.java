class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return helper(root, set, k);
    }
    private boolean helper(TreeNode root, Set<Integer> set, int target) {
        if (root == null) return false;

        if (set.contains(target-root.val))return true;
        set.add(root.val);

        return helper(root.left, set, target) || helper(root.right, set, target);
    }
}