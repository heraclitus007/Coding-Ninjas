/*
Sort an array A using Quick Sort.
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
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
*/


public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		qs(input,0,input.length-1);
	}
    
    public static void qs(int[] arr,int beg,int end){
        
        if(beg>=end)
            return;
        
        int c=partition(arr,beg,end);
        qs(arr,beg,c-1);
        qs(arr,c+1,end);
        
    }
    
    
    public static int partition(int[] arr,int beg,int end){
        
        int pivot=arr[end];
        int pi=beg;
        
        for(int i=beg;i<end;i++){
            
            if(arr[i]<pivot){
                
                int temp=arr[pi];
                arr[pi]=arr[i];
                arr[i]=temp;
            	pi++;    
            }
            
            
        }
        
        int temp=arr[pi];
        arr[pi]=pivot;
        arr[end]=temp;
        
        return pi;
        
    }
	
}