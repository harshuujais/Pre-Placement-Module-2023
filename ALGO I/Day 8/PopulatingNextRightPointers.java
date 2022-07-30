class Solution {
    public Node connect(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        Node left = root.left;
        Node right = root.right;
        solve(left, right);
        return root;
    }
    
    private void solve(Node left, Node right) {
        left.next = right;
        if (left.left != null) {
            solve(left.left, left.right);
            solve(left.right, right.left);
            solve(right.left, right.right);
        }
    }
    
}
