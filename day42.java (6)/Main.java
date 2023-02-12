/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



112. Path Sum





class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root == null )
       {
           return false;
       }
       boolean ans = false; 
       int subSum = targetSum- root.val;
       if (subSum == 0 && root.left == null
            && root.right == null)
            return (ans = true);
       if(root.left != null)
       {
           ans = ans || hasPathSum( root.left, subSum);
       }
       if(root.right != null)
       {
           ans = ans || hasPathSum( root.right, subSum);
       }
       return ans;

    }
}
