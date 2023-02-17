/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



783. Minimum Distance Between BST Nodes





class Solution {
    List<Integer> list = new ArrayList<Integer>();
     int min_Diff = Integer.MAX_VALUE;

     public int minDiffInBST(TreeNode root) {
      if(root == null) return 0;
      inorderTraversal(root,list); 

      for(int i=0; i<list.size()-1; i++)
      {
          min_Diff = Math.min(min_Diff, list.get(i+1)-list.get(i));
      }
      return min_Diff;
    }

     public void inorderTraversal(TreeNode root,List<Integer> list){
         if(root == null)   return ;
         
            inorderTraversal(root.left,list);
            list.add(root.val);
            inorderTraversal(root.right,list);
        
    }
    
    
}