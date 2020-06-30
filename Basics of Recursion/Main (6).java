/*
Given is the code to print numbers from 1 to n in increasing order recursively. But it contains few bugs that you need to rectify such that all the test cases pass.

Integer n
Numbers from 1 to n (separated by space)

1 <= n <= 10000

SAMPLE I/P 1:
6
 
SAMPLE O/P 1:
1 2 3 4 5 6

SAMPLE I/P 2:

*/

import java.util.Scanner;

public class Runner {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Solution.print(n);
	}
	
}

public class Solution {

	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
		}
        else{
         
		 print(n - 1);
   		 System.out.print(n+" ");
        }
	}

}