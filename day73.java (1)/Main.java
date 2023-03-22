/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//345. Reverse Vowels of a String



class Solution {
    //function to check for vowel
    public boolean isVowel(char c)
    {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }

    //function to reverse order of vowels
    public String reverseVowels(String s) {
       int j=0; 

       // storing the vowels separately
       char[] str = s.toCharArray();
        String vowel = "";
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                j++;
                vowel += str[i];
            }
        }
         // Placing the vowels in the reverse
        // order in the string
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                str[i] = vowel.charAt(--j);
            }
        }
 
        return String.valueOf(str);
       }  
    }