/*
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.

Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

indexes where x is present in the array (separated by space)

1 <= N <= 10^3

SAMPLE I/P 1:
5
9 8 10 8 8
8
SAMPLE O/P 1:
1 3 4



*/

import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
	static ArrayList<Integer> a=new ArrayList<Integer>();
	static int index=0;
    public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
         
		 ArrayList<Integer> al=compute(input,x);
         int[] arr=create(al);
         return arr;
         
        
        
	}
    public static int[] create(ArrayList<Integer> al){
        int[] arr = al.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    public static ArrayList<Integer> compute(int input[],int x){
        if(x==input[0])
            a.add(index);
        if(input.length==1)
            return a;
        else{
            index++;
            ArrayList<Integer> ans=compute(Arrays.copyOfRange(input,1,input.length),x);
            return ans;
        }
    }
	
	
}