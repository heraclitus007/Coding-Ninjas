/*
Given the code to find out and return the number of digits present in a number recursively. But it contains few bugs, that you need to rectify such that all the test cases should pass.

Integer n
Count of digits

1 <= n <= 10^6

SAMPLE I/P 1:
156
 
SAMPLE O/P 1:
3



*/

import java.util.Scanner;

public class Runner {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.count(n));
	}
	
}
public class Solution {

	public static int count(int n){
		if(n == 0){
			return 0;
		}
        else{
        	int smallAns = count(n / 10);
			return smallAns + 1;    
        }
		
	}

}