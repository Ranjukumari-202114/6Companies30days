/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public String intToRoman(int num) {

    int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };    
     StringBuilder str = new StringBuilder();

	for (int i = 0; i < values.length; i++) {
		while (num >= values[i]) {
			num -= values[i];
			str.append(romanLiterals[i]);
		}
	}
	return str.toString();   
    }
}