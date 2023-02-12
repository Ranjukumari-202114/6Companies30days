/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


104. Maximum Depth of Binary Tree



class Solution {
    public int maxDepth(TreeNode root) {
      if(root == null)
      {
          return 0;
        
      } 
      int left_height = maxDepth(root.left);
      int right_height = maxDepth(root.right);
      return 1+Math.max(left_height,right_height); 
    }
}