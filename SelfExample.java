/**
 * @author Josh Gibb
 * SelfExample.java
 * A project where I showed how 2D arrays are great for linear graphs
 */
public class SelfExample {
    // Stored a linear graph with some coordinates
    private static int[][] coordinates = 
        {   {1, 3}, 
            {2, 5},
            {3, 7}
        };
    
    // Finds the Gradient for the linear Graph    
    public static double gradient(int[][] graph) throws Exception{
        if(graph.length < 2 || (graph[1][0] - graph[0][0] == 0))
            throw new Exception();
        return (graph[1][1] - graph[0][1])/ ((double) graph[1][0] - graph[0][0]);
    }
    public static void main(String[] args){
        try{
            System.out.println("The gradient for the slope is " + gradient(coordinates));
        }
        catch(Exception e){
            System.out.println("Invalid coordinates entered");
        }
    }
}
