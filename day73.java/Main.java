/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//17. Letter Combinations of a Phone Number



class Solution {
    public List<String> letterCombinations(String digits) {
     List<String> ans = new ArrayList<>();
     if(digits.length() == 0)
        return ans;



     HashMap <Character, String>  hmp = new HashMap<>();
     hmp.put('2' , "abc"); 
     hmp.put('3' , "def");
     hmp.put('4' , "ghi");
     hmp.put('5' , "jkl");
     hmp.put('6' , "mno");
     hmp.put('7' , "pqrs");
     hmp.put('8' , "tuv");
     hmp.put('9' , "wxyz"); 

     backtrack(digits , 0, hmp, new StringBuilder(), ans);
     return ans; 
    }


    private static  void backtrack(String digits, int i,HashMap <Character, String>  hmp, StringBuilder sb, List<String> ans)
    {
        if(i== digits.length())
        {
            ans.add(sb.toString());
            return;
        }
        String curr = hmp.get(digits.charAt(i));
        for(int k=0; k<curr.length();k++)
        {
            sb.append(curr.charAt(k));
            backtrack(digits,i+1,hmp,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
