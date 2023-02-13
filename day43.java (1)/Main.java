/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


98. Validate Binary Search Tree



class Solution {
    public boolean isValidBST(TreeNode root) {
      return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
       }
      
       private boolean isValidBST(TreeNode root, long min, long max){
        if(root == null) return true;

        if((root.val > min && root.val < max)){
            return isValidBST(root.left, min, (long)root.val) 
                    && isValidBST(root.right, (long)root.val, max);
        }else{
            return false;
        }
    }
}