/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



700. Search in a Binary Search Tree



class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)  return  root;
        if(root.val == val)
        {
            return root;
        }
        else if(val<root.val)
        {
            return searchBST(root.left,val);
        }
        else
        {
            return searchBST(root.right,val);
        }
        
    }
}