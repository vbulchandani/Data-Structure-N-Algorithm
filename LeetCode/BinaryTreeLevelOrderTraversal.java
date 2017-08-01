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
 Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/

//Question is given at https://leetcode.com/problems/binary-tree-level-order-traversal/#/description
 
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if(root==null) return result;
    
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            
            while(q.size()>0){
                int size = q.size();
                List<Integer> output = new ArrayList<Integer>();    
                
                for(int i=0; i<size; i++){
                    TreeNode node = q.poll();
                    output.add(node.val);
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }
			result.add(output);
			}
			return result;   
    }
}