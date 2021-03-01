
public class Main
{
	public static void main(String[] args) {
		int a[]={2,43,34,56,54,789,13,923,1024,5,11};
		
		for(int i=0;i<a.length;i++){
		    int temp=a[i],pos=i;
		    for(int j=i;j<a.length-1;j++){
		        
		        if(temp>a[j+1]){temp=a[j+1];pos=j+1;}
		        
		    }
		    System.out.println("short  s:"+a[pos]);
		    int temp_1=a[i];
		    a[i]=a[pos];
		    a[pos]=temp_1;
		    
		    
		}
		for(int k:a){System.out.print(k+" ");}
	}
}
