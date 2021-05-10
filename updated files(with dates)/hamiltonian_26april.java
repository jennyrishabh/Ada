package ada_2021;

//import java.util.Scanner;
import java.util.Arrays;


//19csu247
//date created  :26 april_2021

 

public class hamiltonian_26april
{
    private int V, pathCount;
    private int[] path;     
    private int[][] graph;
 
    
    public void findHamiltonianCycle(int[][] g)
    {
        V = g.length;
        path = new int[V];
 
        Arrays.fill(path, -1);
        graph = g;        
        try
        {            
            path[0] = 0;
            pathCount = 1;            
            solve(0);
            System.out.println("No solution");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            display();
        }
    }
    
    public void solve(int vertex) throws Exception
    {
        
        if (graph[vertex][0] == 1 && pathCount == V)
            throw new Exception("Solution found");
        
        if (pathCount == V)
            return;
 
        for (int v = 0; v < V; v++)
        {
           
            if (graph[vertex][v] == 1 )
            {
                 
                path[pathCount++] = v;    
                  
                graph[vertex][v] = 0;
                graph[v][vertex] = 0;
 
                
                if (!isPresent(v))
                    solve(v);
 
               
                graph[vertex][v] = 1;
                graph[v][vertex] = 1;
                // remove path 
                path[--pathCount] = -1;                    
            }
        }
    }    
    // function to check if path is already selected
    public boolean isPresent(int v)
    {
        for (int i = 0; i < pathCount - 1; i++)
            if (path[i] == v)
                return true;
        return false;                
    }
    
    public void display()
    {
        System.out.print("\nPath : \n");
        for (int i = 0; i <= V; i++)
            System.out.println(path[i % V]);
        
    }    
    
    public static void main (String[] args) 
    {
        //Scanner scan = new Scanner(System.in);
        
        hamiltonian_26april ham = new hamiltonian_26april();
 
        System.out.println("\nEntry of the matrix\n");
        
        		
        int[][] array1= {{0, 1, 0, 1, 0},
			            {1, 0, 1, 1, 1},
			            {0, 1, 0, 0, 1},
			            {1, 1, 0, 0, 1},
			            {0, 1, 1, 1, 0}};
        
        ham.findHamiltonianCycle(array1);        
    }    
}



/*
 
 output : 
 
 HamiltonianCycle as on _26april_2021


Entry of the matrix

Solution found

Path : 
0
1
2
4
3
0
 
 
 
 
 
 
 
 
 */