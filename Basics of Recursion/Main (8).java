/*
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.

Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Sum

1 <= N <= 10^3
SAMPLE I/P 1:
3
9 8 9
SAMPLE O/P 1:
26


*/

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(Solution.sum(input));
	}
}
import java.util.Arrays;
public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length==1)
            return input[0];
        else{
            return input[0]+sum(Arrays.copyOfRange(input,1,input.length));
        }
		
	}
}