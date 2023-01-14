/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

* @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        while(start<=end) {
          int pick = start+(end-start)/2;
          if(guess(pick)==0)
            return pick;
          else if(guess(pick)==1)
            start = pick+1;
          else
            end = pick-1;
        }
        return -1;
    }
}