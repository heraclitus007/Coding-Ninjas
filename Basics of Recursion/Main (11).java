/*
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.

Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

last index or -1

1 <= N <= 10^3

SAMPLE I/P 1:
4
9 8 10 8
8
SAMPLE O/P 1:
3



*/

import java.util.Arrays;
public class Solution {
	static int max=-1,index=0;
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if (x==input[0])
            max=index;
        if(input.length==1)
            return -1;
        else{
            index++;
            int ans=lastIndex(Arrays.copyOfRange(input,1,input.length),x);
            if(ans==-1)
                return max;
            else
                return ans;
    	
        }
        
    	
    }
            

}   
	
}