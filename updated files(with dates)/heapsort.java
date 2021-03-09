package ada_2021;

import java.util.Random;

//19csu247
//date created : 1 march 
public class heapsort {
	
	public void sort(int arr[])
    {
        int n = arr.length;
 
 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
    
        for (int i = n - 1; i > 0; i--) {
          
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
           
            heapify(arr, i, 0);
        }
    }
 
    
    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
    
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
       
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
         
            heapify(arr, n, largest);
        }
    }
 
   
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "  ");
        System.out.println();
    }
 
   
    public static void main(String args[])
    {
    	Random random = new Random();
        int arr[] = new int[100];
        for(int i =0;i<100;i++)
        {
        	int randomNumber = random.nextInt(1000);
        	arr[i]=randomNumber;
        }
        
 
        heapsort ob = new heapsort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
    /* output  :
    	
    	Sorted array is
		3  8  15  28  30  43  48  55  65  70  77  78  89  95  125  139  144  156  158  158  167  167  177  192  194  195  198  202  228  228  241  242  256  257  270  280  287  307  321  322  329  330  355  359  402  404  414  449  459  464  471  491  504  510  517  532  537  548  573  577  591  593  601  608  615  615  620  625  666  692  693  708  721  748  774  799  804  814  826  832  848  853  857  861  875  882  890  904  918  925  936  936  943  956  963  964  967  981  987  990  



     */
    

}
