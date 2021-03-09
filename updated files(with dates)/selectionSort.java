public class Main
{
    //19csu247
    //date created : 6 feb
	public static void main(String[] args) {
		int a[]={2,43,34,56,54,789,13,923,1024,5,11};
		
		for(int i=0;i<a.length;i++){
		    int temp=a[i],pos=i;
		    for(int j=i;j<a.length-1;j++){
		        
		        if(temp>a[j+1]){temp=a[j+1];pos=j+1;}
		        
		    }
		    
		    int temp_1=a[i];
		    a[i]=a[pos];
		    a[pos]=temp_1;
		    
		    
		}
		for(int k:a){System.out.print(k+" ");}
	}
	
	/* output : 
	
	short  s:2                                                                                                                                                          
short  s:5                                                                                                                                                          
short  s:11                                                                                                                                                         
short  s:13                                                                                                                                                         
short  s:34                                                                                                                                                         
short  s:43                                                                                                                                                         
short  s:54                                                                                                                                                         
short  s:56                                                                                                                                                         
short  s:789                                                                                                                                                        
short  s:923                                                                                                                                                        
short  s:1024   


2 5 11 13 34 43 54 56 789 923 1024  

*/
}
