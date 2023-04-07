/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//897. Increasing Order Search Tree





class Solution {
    public TreeNode increasingBST(TreeNode root) {
     return increasingBST(root, null);   
    }

    private TreeNode increasingBST(TreeNode root, TreeNode tail) {
    if (root == null)
      return tail;

    TreeNode ans = increasingBST(root.left, root);
    root.left = null;
    root.right = increasingBST(root.right, tail);
    return ans;
  }
}