/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
/** 
 Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3 
*/
// Question is given at https://leetcode.com/problems/symmetric-tree/#/description

public class Solution {
    public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode t1 = queue.poll();
                TreeNode t2 = queue.poll();
                if(t1==null && t2==null) continue;
                if(t1==null || t2==null) return false;
                if(t1.val!=t2.val) return false;
                queue.add(t1.left);
                queue.add(t2.right);
                queue.add(t1.right);
                queue.add(t2.left);
            }
        return true;
    }
}