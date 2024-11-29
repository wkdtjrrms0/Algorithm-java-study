/**
 * Info: Leetcode#230 Kth Smallest Element in a BST
 * Ref: https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
 */
public class Main {

	static boolean[] nums = new boolean[10001]; // 카운팅 알고리즘

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3, new TreeNode(1,null, new TreeNode(2)), new TreeNode(4));
		System.out.println(kthSmallest(root, 1));
//
//		TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), new TreeNode()), new TreeNode(4)), new TreeNode(6));
//		System.out.println(kthSmallest(root, 3));
	}

	private static int kthSmallest(TreeNode root, int k) {
		nums[root.val] = true;

		if (root.left != null) {
			kthSmallest(root.left, 0);
		}

		if (root.right != null) {
			kthSmallest(root.right, 0);
		}

		if (k != 0) {
			int t = 0;
			for (int i = 0; i <= nums.length; i++) {
				if (nums[i]) {
					t++;
					if (t == k) {
						return i;
					}
				}
			}
		}
        return 0;
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