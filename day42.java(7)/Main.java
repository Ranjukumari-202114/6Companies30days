/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




145. Binary Tree Postorder Traversal




class Solution {
    public List<Integer> postorderhelper(TreeNode root,List<Integer> list)
    {
        if(root == null) return  list;
        postorderhelper(root.left, list);
        postorderhelper(root.right, list);
        list.add(root.val);
        return list;


    } 

    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      return postorderhelper(root,list);  
    }
}