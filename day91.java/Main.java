/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




//888. Fair Candy Swap






class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
     int sumA = 0, sumB = 0;
        for (int i = 0; i < aliceSizes.length; i++)
            sumA += aliceSizes[i];
        for (int i = 0; i < bobSizes.length; i++)
            sumB += bobSizes[i];
        int dif = (sumA - sumB) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (aliceSizes[i] - bobSizes[j] == dif)
                    return new int[]{aliceSizes[i], bobSizes[j]};
            }
        }
        return null;   
    }
}

