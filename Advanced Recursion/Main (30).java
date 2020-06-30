/*
Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/

public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		
		sort(input,0,input.length-1);
        
        
	}
    
    public static void sort(int[] arr,int beg,int end){
        
        if(beg>=end)
            return;
        
        int mid=(beg+end)/2;
        
        sort(arr,beg,mid);
        sort(arr,mid+1,end);
        
        merge(arr,beg,end);
        
        
    }
    
    public static void merge(int[] a,int beg,int end){
        
        int mid=(beg+end)/2;
        // int nl=mid-beg+1;
        // int nr=end-mid;
        
        int i = beg;
    	int j = mid+1;
    	int k = 0;
    
    	int[] temp=new int[end-beg+1];
    
    	while(i<=mid && j<=end){
        	if(a[i] < a[j]){
            	temp[k++] = a[i++];
        	}
        	else{
            	temp[k++] = a[j++];
        	}
    	}
    	while(i<=mid){
        	temp[k++] = a[i++];
    	}
    	while(j<=end){
        	temp[k++]  = a[j++];
    	}
    
    //We need to copy all element to original arrays
        int c=0;
    	for(int b=beg;b<=end;b++,c++){
        	a[b] = temp[c];
    	}
    }
}
