/*
    Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.

Two integers x and n (separated by space)

x^n (i.e. x raise to the power n)

1 <= x <= 30
0 <= n <= 30

SAMPLE I/P 1:
 3 4
 
SAMPLE O/P 1:
81

*/

SAMPLE INPUT:
7
62 63 70 66 64 68 61
SAMPLE OUTPUT:
8


*/

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(Solution.power(x, n));
	}
}

public class Solution {

	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(n==0)
            return 1;
        else if(n==1)
            return x;
        else
            return x*power(x,n-1);
	}
}