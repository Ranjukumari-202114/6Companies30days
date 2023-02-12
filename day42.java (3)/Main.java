/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



101. Symmetric Tree





class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
        
    }
    boolean isMirror(TreeNode node1, TreeNode node2)
    {
        if(node1 == null && node2 == null)
        {
            return true;
        }
        if(node1 == null ||  node2 == null)
        {
            return false;
        }
        if(node1.val != node2.val)
        {
            return false;
        }
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);



    }
}
