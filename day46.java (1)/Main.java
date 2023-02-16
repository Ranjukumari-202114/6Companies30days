/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



111. Minimum Depth of Binary Tree



class Solution {
    public int minDepth(TreeNode root) {
      if(root == null) return 0;
      if(root.left == null && root.right == null) return 1;

      int left_height  = minDepth(root.left);  
      int right_height  = minDepth(root.right);


     if(root.left != null && root.right != null) 
      return Math.min(left_height, right_height) + 1;

      else if(root.left != null) return  left_height+ 1;

     else return right_height + 1;
       
    }
}