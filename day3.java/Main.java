/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> map = new HashMap<>();
 		int[] indegree = new int[numCourses];
 		Set<Integer> remain = new HashSet<>();
 		for(int i = 0; i < numCourses; i++) remain.add(i);
 		for(int[] req : prerequisites){
 			indegree[req[1]]++;
 			List<Integer> next = map.containsKey(req[0]) ? map.get(req[0]): new ArrayList<Integer>();
 			next.add(req[1]);
 			map.put(req[0], next);
 		}
 		Queue<Integer> queue = new LinkedList<>();
 		for(int i = 0; i < numCourses; i++){
 			if(indegree[i] == 0)
 				queue.offer(i);
 		}
 		while(!queue.isEmpty()){
 			int course = queue.poll();
 			remain.remove(course);
 			List<Integer> courses = map.get(course);
 			if(courses == null) continue;
 			for(Integer c : courses){
 				if(--indegree[c] == 0)
 					queue.offer(c);
 			}
 		}
 		return remain.isEmpty();    
    }
}