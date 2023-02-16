/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


617. Merge Two Binary Trees




class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
     
     if(root1 == null)  return root2;
     if(root2 == null)  return root1;
     
       TreeNode node = new TreeNode (root1.val+root2.val);
       node.left = mergeTrees(root1.left, root2.left);
       node.right = mergeTrees(root1.right, root2.right);
       return node;
     
      
    }
}
