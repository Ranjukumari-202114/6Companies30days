/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1108. Defanging an IP Address



class Solution {
    public String defangIPaddr(String address) {
      return address.replace(".","[.]");  
    }
}