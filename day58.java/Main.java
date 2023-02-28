/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//652. Find Duplicate Subtrees





class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> count = new HashMap();
    List<TreeNode> ans = new ArrayList();
    collect(root, count, ans);
    return ans;
  }

  private String collect(TreeNode node, Map<String, Integer> count, List<TreeNode> ans) {
    if (node == null)     return "#";

    String serial = node.val + "," + collect(node.left, count, ans) + "," + collect(node.right, count, ans);
    count.put(serial, count.getOrDefault(serial, 0) + 1);
    if (count.get(serial) == 2) {
      ans.add(node);
    }
    return serial; 
    }
}