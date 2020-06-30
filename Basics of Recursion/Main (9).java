/*
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

'true' or 'false'

1 <= N <= 10^3

SAMPLE I/P 1:
3
9 8 10
8
SAMPLE O/P 1:
true


*/

import java.util.Arrays;
public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if (x==input[0])
            return true;
        else if(x!=input[0]&&input.length==1)
            return false;
        else{
            return checkNumber(Arrays.copyOfRange(input,1,input.length),x);
        }
	}
}