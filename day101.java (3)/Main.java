/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1768. Merge Strings Alternately






class Solution {
    public String mergeAlternately(String word1, String word2) {
    //  StringBuilder sb = new StringBuilder();
    //  int n1 = word1.length();
    //  int n2 = word2.length();
    //  int i=0;
    //  while(i<n1 || i<n2) 
    //  { 
    //     if(i<n1)
    //       sb.append(word1.charAt(i));

    //     if(i<n2)
    //       sb.append(word2.charAt(i));

    //     i++;
    //  }
    //  return sb.toString();  


    String s = "";
    int i=0;
    int j=0;
    while(i<word1.length() && j<word2.length())
    {
        s = s+word1.charAt(i);
        s = s+word2.charAt(j);
        i++;
        j++;

    }

    for(int m = i ; m<word1.length(); m++)
          s = s+word1.charAt(m);

    for(int n = j ; n<word2.length(); n++)
          s = s+word2.charAt(n);


    return s;      

    }
}