/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public String getHint(String secret, String guess) {
    int[] nums = new int[10];
    char[] x = secret.toCharArray();
    char[] y = guess.toCharArray();
    int a = 0, b = 0;
    for(int i = 0; i < x.length; i++){
        if(x[i] == y[i]) {
            a++;
        } else{
            if(nums[y[i] - '0']-- > 0) b++;
            if(nums[x[i] - '0']++ < 0) b++;
        }
    }
    return a + "A" + b + "B";    
    }
}
