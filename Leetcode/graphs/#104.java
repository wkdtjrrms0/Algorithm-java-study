/**
 * Info: Leetcode#104 Maximum Depth of Binary Tree
 * Ref: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        //TreeNode root = new TreeNode(1,new TreeNode(), new TreeNode(2));
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        int depth = 1;
        if (root != null) {
            if (root.left != null || root.right != null) {
                depth += Math.max(maxDepth(root.left), maxDepth(root.right));
            }
        } else {
            depth = 0;
        }

        return depth;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}