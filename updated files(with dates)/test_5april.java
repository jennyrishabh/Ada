package ada_2021;


public class test_5april {
	
	//19csu247
		
	
	static void selectionSort(String arr[],int n)
	{
		
				for(int i = 0; i < n - 1; i++)
				{
				
					
					int min_index = i;
					String minStr = arr[i];
					for(int j = i + 1; j < n; j++)
					{
						
					
					
						if(arr[j].compareToIgnoreCase(minStr) < 0)
						{
							
							minStr = arr[j];
							min_index = j;
						}
					}
		
				// Swapping Part
						
							String temp = arr[min_index];
							arr[min_index] = arr[i];
							arr[i] = temp;
						
				}
				
				
				
				
	}

	
	public static void main(String args[])
	{
		String arr[] = {"ada","cyber","ade","dbms","IOT","IPS","iots"};
		int n = arr.length;
			System.out.println("Given array is");
			
		// before sorting
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" , ");
		}
		System.out.println("\n");

		selectionSort(arr, n);

		System.out.println("afert Sorted ");
		
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" , ");
		}
	}
	

}



/* 

output : 



Given array is
ada , cyber , ade , dbms , IOT , IPS , iots , 

afert Sorted 
ada , ade , cyber , dbms , IOT , iots , IPS , 



*/
