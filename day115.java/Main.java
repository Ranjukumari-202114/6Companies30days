/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2215. Find the Difference of Two Arrays



class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        fillHashSet(nums1, s1);
        fillHashSet(nums2, s2);

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();


        for(int i : nums1){
            if(!s2.contains(i)){
                if(!l1.contains(i)) l1.add(i);
            }
        }

        for(int i : nums2){
            if(!s1.contains(i)){
                if(!l2.contains(i)) l2.add(i);
            }
        }
        List<List<Integer>> res = new ArrayList<>();

        res.add(l1);
        res.add(l2);

        return res;


    }

    static void fillHashSet(int[] nums, Set<Integer> set){
        for(int i : nums){
            set.add(i);
        }
    }
}
  