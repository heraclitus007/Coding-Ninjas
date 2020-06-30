/*
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.

Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

first index or -1

1 <= N <= 10^3

SAMPLE I/P 1:
4
9 8 10 8
8
SAMPLE O/P 1:
1



*/

import java.util.Arrays;
public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if (x==input[0])
            return 0;
        else if(x!=input[0]&&input.length==1)
            return -1;
        else{
            int ans=firstIndex(Arrays.copyOfRange(input,1,input.length),x);
            if(ans==-1)
                return ans;
            else
                return ans+1;
        }
	}
	
}