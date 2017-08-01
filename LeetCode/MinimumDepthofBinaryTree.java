
// This question is given at https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
**/

public class Solution {
    public int minDepth(TreeNode root) {
            if(root==null) return 0;
            
            int depth = 1;
        
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            
            while(q.size()>0){
          
                int size = q.size();
                
                for(int i=0; i<size; i++){
                    TreeNode node = q.poll();
                    if(node.right==null && node.left==null) return depth;
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }
            depth++;
        }
        
    return depth;   
    }
}