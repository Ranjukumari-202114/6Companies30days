/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/





108. Convert Sorted Array to Binary Search Tree




class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      if(nums.length == 0)  return null;
       return heightBalancesBST(nums, 0 ,nums.length-1);
    }
    public TreeNode heightBalancesBST(int[] nums,int start, int end)
    {
        if(start>end)
             return null;


        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = heightBalancesBST(nums,start,mid-1);
        root.right = heightBalancesBST(nums,mid+1,end);
        return root;
    }
}