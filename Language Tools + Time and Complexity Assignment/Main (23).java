/*
Given a random integer array A of size N. Find and print the pair of elements in the array which sum to 0.
Array A can contain duplicate elements.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, -6) print "-6 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.
Input format :
Line 1 : Integer N (Array size)
Line 2 : Array elements (separated by space)
Output format :
Line 1 : Pair 1 elements (separated by space)
Line 2 : Pair 2 elements (separated by space)
Line 3 : and so on
Constraints :
0 <= N <= 10^4
Sample Input:
5
2 1 -2 2 3
Sample Output :
-2 2
-2 2
*/

import java.util.*;
import java.util.Arrays;
public class Solution {
	public static void PairSum(int[] arr, int size) {
		
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print the desired output and don't return anything.
	 	 * Taking input is handled automatically.
		 */
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++){
            
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        
        for(int i=0;i<size;i++){
            
            if(hm.containsKey(-arr[i])&&hm.get(arr[i])>0&&hm.get(-arr[i])>0){
                int n1=hm.get(arr[i]);
                int n2=hm.get(-arr[i]);
                for(int j=0;j<n1*n2;j++){
                    System.out.println(Math.min(arr[i],-arr[i])+" "+Math.max(arr[i],-arr[i]));
                    
                }
                hm.put(arr[i],0);
                hm.put(-arr[i],0);
            }
        }
	}
}