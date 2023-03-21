/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//705. Design HashSet


class MyHashSet {
   private boolean[] data = new boolean[1000001];


    public MyHashSet() {
        
    }
    
    public void add(int key) {
        data[key] = true;

    }
    
    public void remove(int key) {
        data[key] = false;

    }
    
    public boolean contains(int key) {
        return data[key];

    }
}