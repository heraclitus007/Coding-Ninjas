/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*
For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.
For each test case, print the single integer denoting the sum.

Output for every test case will be printed in a seperate line.
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec

SAMPLE INPUT:
1
3
1 2 3
4 5 6
7 8 9

SAMPLE OUTPUT:
45

Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.

Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16

Sample output 2:
273
136

*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 1  2  3  4
           5  6  7  8
           9  10 11 12
           13 14 15 16*/
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if((i+j)!=n-1&&(i!=j))
                    sum-=arr[i][j];
            }
        }
        System.out.println(sum);
	}
}
