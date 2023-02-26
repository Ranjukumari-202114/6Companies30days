/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



812. Largest Triangle Area




class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0.0;
         
        for (int p1 = 0; p1 < points.length; p1++) {
            for (int p2 = p1 + 1; p2 < points.length; p2++) {
                for (int p3 = p2 + 1; p3 < points.length; p3++) {
                    area = Math.max(area, getArea(points[p1], points[p2], points[p3]));
                }
            }
        }
         
        return area; 
    }

    private double getArea(int[] p1, int[] p2, int[] p3) {
        return Math.abs((p2[0] - p1[0]) * (p3[1] - p1[1]) - 
                       0.5 * (p2[0] - p1[0]) * (p2[1] - p1[1]) - 
                       0.5 * (p3[0] - p1[0]) * (p3[1] - p1[1]) -
                       0.5 * (p2[0] - p3[0]) * (p3[1] - p2[1]));
    }
}