/*
You are given an integer N. You need to return an integer M, in which only one bit is set which at position of lowest set bit of N (from right to left).
Input Format :
Integer N
Output Format :
Integer M
Sample Input 1 :
7
Sample Output 1 :
1
Sample Input 2 :
12
Sample Output 2 :
4
*/





public class Solution {
	public static int returnFirstSetBit(int n) {
    	//Write your code here
        if((n&1)==1)
        	return 1;
    	else{
		//boolean flag=false;  
        	int i=0;
        	while(true){
            	int x=n;
            	if((x&(1<<i))==(1<<i))
                	return 1<<i;
           		i++;
            
        	}
        }
        
    } 
	
}