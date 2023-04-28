/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//500. Keyboard Row




class Solution {
    public String[] findWords(String[] words) {
      if(words == null || words.length == 0)
            return new String[0];

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c1 = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] c2 = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] c3 = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        for(char c: c1)
            map.put(c, 1);
        for(char c: c2)
            map.put(c, 2);
        for(char c: c3)
            map.put(c,3);

        List<String> list = new ArrayList<String>();
        for(String word: words) {
            String lowerCased = word.toLowerCase();
            int row = map.get(lowerCased.charAt(0));

            int i = 1;
            for(; i < lowerCased.length(); i++) {
                if(map.get(lowerCased.charAt(i)) != row)
                    break;
            }

            if(i == lowerCased.length())
                list.add(word);
        }

        String[] res = new String[list.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = list.get(i);

        return res;  
    }
}