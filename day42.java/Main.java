/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


144. Binary Tree Preorder Traversal




class Solution {
    public List<Integer> prehelper(TreeNode root,List<Integer> list)
    {
         if(root == null)
           return list;

        // add to preorder
        list.add(root.val);
        prehelper(root.left, list);
        prehelper(root.right, list);

        return list;

    }
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
       return prehelper(root,list); 
    }
}