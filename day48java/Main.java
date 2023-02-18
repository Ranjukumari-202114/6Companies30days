/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


543. Diameter of Binary Tree






class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
       int[] diameter = new int[1];
       height(root,diameter);
       return diameter[0];   
    }
    private int height(TreeNode root,int[] diameter)
    {
        if(root == null)
        {
            return 0;
        }
        int left = height(root.left,diameter);
        int right = height(root.right,diameter);

        diameter[0]= Math.max(diameter[0],left+right);
        return 1+Math.max(left,right);
    }
}