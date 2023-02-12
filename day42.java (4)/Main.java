/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


226. Invert Binary Tree




class Solution {
    public TreeNode invertTree(TreeNode root) {
      if(root == null)
      return root;
      TreeNode temp = root.left;
      root.left = invertTree(root.right);
      root.right = invertTree(temp);
      return root;  
    }
}