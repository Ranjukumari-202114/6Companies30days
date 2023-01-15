/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int start = 1;
      int end = n;
       int ans=0;
        while(start<=end)
        {
           int  mid = start + (end - start)/2 ;
            if(isBadVersion(mid))
            {
                end=mid-1;
                ans=mid;
            }
            else
                start=mid+1;
        }
        return ans;
        
    }
}