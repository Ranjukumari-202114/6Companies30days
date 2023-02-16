/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


110. Balanced Binary Tree


class Solution {
    public boolean isBalanced(TreeNode root) {
      if(root == null)  return true;
      if(Math.abs(getheight(root.left)- getheight(root.right))>1) return false;
      return isBalanced(root.left) && isBalanced(root.right);
    }
    public int getheight(TreeNode root)
    {
        if(root == null) return 0;
        return 1+Math.max(getheight(root.left), getheight(root.right));
    }
}