class Solution {

    List<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0, list.size() - 1);
    }

    // Step 1: inorder traversal
    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    // Step 2: build balanced BST
    private TreeNode build(int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = build(left, mid - 1);
        node.right = build(mid + 1, right);

        return node;
    }
}
