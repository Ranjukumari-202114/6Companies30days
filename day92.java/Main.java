/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1470. Shuffle the Array




class Solution {
    public int[] shuffle(int[] nums, int n) {
      int[] arr=new int[nums.length];
        
        int i=0;
        int h=(nums.length/2);
        int l=0;
        while(i<nums.length)
        {
            if(i%2==1){
                arr[i]=nums[h];
                h++;
            }
            else{
                arr[i]=nums[l];
                l++;
            }
            
            i++;
        }
        return arr;  
    }
}