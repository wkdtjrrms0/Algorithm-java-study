import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Info: Leetcode#144 Binary Tree Preorder Traversal
 * Ref: https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class Main {
    private static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // CASE 1
//        TreeNode root = new TreeNode(1,null, new TreeNode(2, new TreeNode(3), null));
        // CASE 2
//        TreeNode root = new TreeNode(1,new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))), new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));
        // CASE 3
        TreeNode root = null;
        // CASE 4
//        TreeNode root = new TreeNode(1);
        System.out.println(preorderTraversal(root));
    }
    private static List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            result.add(root.val);
            if (root.left != null) {
                preorderTraversal(root.left);
            }
            if (root.right != null) {
                preorderTraversal(root.right);
            }
        }
        return result;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}