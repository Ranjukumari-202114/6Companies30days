/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


103. Binary Tree Zigzag Level Order Traversal




class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       if(root == null) return new ArrayList();
       List<List<Integer>> result = new ArrayList();
       Queue<TreeNode> q = new  LinkedList();
       q.add(root);
       boolean reverseLevel = false;

       while(!q.isEmpty())
       {
           int size = q.size();
           List<Integer> level = new ArrayList();
           while(size--> 0)
           {
               root = q.poll();
               level.add(root.val);
               if(root.left != null) q.add(root.left);
               if(root.right != null) q.add(root.right);
           }
           if(reverseLevel) Collections.reverse(level);
           result.add(level);
           reverseLevel = !reverseLevel;
       }
       return result;
    }
}