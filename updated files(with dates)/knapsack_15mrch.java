package ada_2021;

public class knapsack_15mrch {
	
	// 19csu247 
			// date created : 15  march 
		
	
	
	static int KnapSack(int val[], int wt[],  
            int n, int W) 
{ 

int mat[][] = new int[2][W + 1]; 


int i = 0; 
while (i < n) 
{ 
int j = 0; 
if (i % 2 != 0)  
{ 
while (++j <= W) 
{ 
    if (wt[i] <= j) 
    { 
        mat[1][j] = Math.max(val[i] + mat[0][j - wt[i]],  
                                      mat[0][j]); 
    } else 
    { 
        mat[1][j] = mat[0][j]; 
    } 
} 

}  


else 
{ 
while (++j <= W) 
{ 
    if (wt[i] <= j)  
    { 
        mat[0][j] = Math.max(val[i] + mat[1][j - wt[i]], 
                                      mat[1][j]); 
    } else 
    { 
        mat[0][j] = mat[1][j]; 
    } 
} 
} 
i++; 
} 


return (n % 2 != 0) ? mat[0][W] : mat[1][W]; 
} 


public static void main(String[] args) 
{ 
int val[] = {7, 8, 4},  
wt[] = {3, 8, 6}, 
W = 0, n = 3; 
W=(int)(Math.random()*100);

System.out.println("w :"+W+ " n : "+n );
System.out.println("profit : "+KnapSack(val, wt, n, W)); 
} 


}


/*



output : 
 w :78 n : 3
profit : 19




 */
