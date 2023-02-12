/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


94. Binary Tree Inorder Traversal



class Solution {
    public List<Integer> inorderhelper(TreeNode root,List<Integer> list) {
        if(root == null)
        {
            return list;
        }
        inorderhelper(root.left,list);
        list.add(root.val);
        inorderhelper(root.right,list);


         return list;
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorderhelper(root,list);
    }
}