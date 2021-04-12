package ada_2021;

import java.util.Scanner;

public class nqueen {
		
	
	//Rishabh Jain(19csu247)
	// date created : 12 april 2021
	
	  
	  
	    void printSolution(int board[][],int n)
	    {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++)
	             if(board[i][j]==1)
	             {
	            	 System.out.println("column : "+(i+1)+" queen position:"+(j+1));
	             }
	        }
	    }
	 
	    boolean isSafe(int board[][], int row, int col,int n)
	    {
	        int i, j;
	  
	        for (i = 0; i < col; i++)
	            if (board[row][i] == 1)
	                return false;
	  
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	            if (board[i][j] == 1)
	                return false;
	  
	       
	        for (i = row, j = col; j >= 0 && i < n; i++, j--)
	            if (board[i][j] == 1)
	                return false;
	  
	        return true;
	    }
	  
	    /* A recursive utility function to solve N
	       Queen problem */
	    boolean solveNQUtil(int board[][], int col,int n)
	    {
	       
	        if (col >= n)
	            return true;
	  
	        
	        for (int i = 0; i < n; i++) {
	           
	            if (isSafe(board, i, col , n)) {
	               
	                board[i][col] = 1;
	  
	              
	                if (solveNQUtil(board, col + 1, n ) == true)
	                    return true;
	  
	             
	                board[i][col] = 0; 
	            }
	        }
	  
	      
	        return false;
	    }
	  
	   
	    boolean solveNQ(int board[][],int n)
	    {
	    	
	  
	        if (solveNQUtil(board, 0 , n) == false) {
	            System.out.print("Solution does not exist");
	            return false;
	        }
	  
	        printSolution(board,n);
	        return true;
	    }
	  
	    // driver program to test above function
	    public static void main(String args[])
	    {
	        nqueen Queen = new nqueen();
	        Scanner obj = new Scanner(System.in);
	    	System.out.println("Enter Number of block :");
	    	int n = obj.nextInt();
	        int board[][] = new int[n][n];
	        int i,j;
	        for(i=0;i<n;i++)
	        {
	        	for(j=0;j<n;j++)
	        	{
	        		board[i][j]=0;
	        	}
	        }
	        Queen.solveNQ(board,n);
	    }
}
/*
 
 output : 
 
 
 Enter Number of block :
25
column : 1 queen position:1
column : 2 queen position:4
column : 3 queen position:2
column : 4 queen position:5
column : 5 queen position:3
column : 6 queen position:16
column : 7 queen position:19
column : 8 queen position:17
column : 9 queen position:6
column : 10 queen position:18
column : 11 queen position:7
column : 12 queen position:23
column : 13 queen position:8
column : 14 queen position:20
column : 15 queen position:9
column : 16 queen position:21
column : 17 queen position:24
column : 18 queen position:22
column : 19 queen position:10
column : 20 queen position:13
column : 21 queen position:11
column : 22 queen position:25
column : 23 queen position:15
column : 24 queen position:12
column : 25 queen position:14



*/
 
 
 
