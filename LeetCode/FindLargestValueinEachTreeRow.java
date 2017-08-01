/*
You need to find the largest value in each row of a binary tree.

Example:
Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]
*/
//https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> largestValues(TreeNode root) {
            List<Integer> result = new ArrayList<Integer>();
            if(root==null) return result;
    
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            
            while(q.size()>0){
          
                int size = q.size();
                int output = Integer.MIN_VALUE;    
                
                for(int i=0; i<size; i++){
                    TreeNode node = q.poll();
                    if(node.val > output)
                        output = node.val;
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }
        result.add(output);
    }
    return result;   
    }
}