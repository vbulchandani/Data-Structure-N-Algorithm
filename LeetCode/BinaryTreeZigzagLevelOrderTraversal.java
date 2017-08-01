
/**
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
*/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if(root==null) return result;
        
            boolean right = true;
        
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
        
            while(q.size()>0){
                List<Integer> list = new ArrayList<>();
                int size = q.size();
        
                for(int i=0; i<size; i++){
                    TreeNode node = q.poll();
                    if(right) 
                        list.add(node.val);
                    else
                        list.add(0, node.val);
                    
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }
                right = right ? false : true;
                result.add(list);
            }
    return result;       
    }
}