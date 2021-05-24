package ada_2021;
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
class tsp 


//19CSU247   


{  
    static int findHamiltonianCycle(int[][] distance, boolean[] visitCity, int currPos, int cities, int count, int cost, int hamiltonianCycle)   
    {  
    
        if (count == cities && distance[currPos][0] > 0)   
        {  
            hamiltonianCycle = Math.min(hamiltonianCycle, cost + distance[currPos][0]);  
            return hamiltonianCycle;  
        }  
    
        for (int i = 0; i < cities; i++)   
        {  
            if (visitCity[i] == false && distance[currPos][i] > 0)   
            {  
    
                visitCity[i] = true;  
                hamiltonianCycle = findHamiltonianCycle(distance, visitCity, i, cities, count + 1, cost + distance[currPos][i], hamiltonianCycle);  
    
                visitCity[i] = false;  
            }  
        }  
        return hamiltonianCycle;  
    }  
    
    public static void main(String[] args)  
    {  
        int cities;  
          
        Scanner sc = new Scanner(System.in);  
          
        // System.out.println("Enter total number of cities ");  
        // cities = sc.nextInt();  
          
          
       
        // for( int i = 0; i < cities; i++){  
        //     for( int j = 0; j < cities; j++){  
        //         System.out.println("Distance from city"+ (i+1) +" to city"+ (j+1) +": ");  
        //         distance[i][j] = sc.nextInt();  
        //     }  
        // } 
        
        int distance[][] = {{0,4,1,9},
                        {3,0,6,11},
                        {4,1,0,2},
                        {6,5,-4,0}
        };
    
        boolean[] visitCity = new boolean[4];  
    
        // by default,  make the first city visited  
        visitCity[0] = true;  
          
          
        int hamiltonianCycle = Integer.MAX_VALUE;  
    
        // call findHamiltonianCycle() method that returns the minimum weight Hamiltonian Cycle  
        hamiltonianCycle = findHamiltonianCycle(distance, visitCity, 0, 4, 1, 0, hamiltonianCycle);  
    
        // print the minimum weighted Hamiltonian Cycle  
        System.out.println("shortest Route : "+hamiltonianCycle);  
    }  
    
    /*
    
    output : 
    
    shortest Route : 11

    
    
    */
    
}  