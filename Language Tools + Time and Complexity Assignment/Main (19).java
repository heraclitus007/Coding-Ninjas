/*
Given a random integer array and a number x. Find and print the triplets of elements in the array which sum to x.
While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.
Input format :
Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)
Line 3 : Integer x
Output format :
Line 1 : Triplet 1 elements (separated by space)
Line 2 : Triplet 3 elements (separated by space)
Line 3 : and so on
Constraints :
1 <= N <= 1000
1 <= x <= 100
Sample Input:
7
1 2 3 4 5 6 7 
12
Sample Output ;
1 4 7
1 5 6
2 3 7
2 4 6
3 4 5

*/

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class TripletSum {	

	public static void FindTriplet(int[] arr, int x){
		/* Your class should be named TripletSum.
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */
    
       Arrays.sort(arr); 
       //int max=arr[arr.length-1];
       	for (int i = 0; i < arr.length; i++)
	{
		int val = x-arr[i];
		int j = i+1;
		int k = arr.length-1;
		while(j<k ){
			
			
			if (arr[j]+arr[k]>val)	
			{
				k--;

			}else if (arr[j]+arr[k]<val)
			{
				j++;

			}else{
                //cout<<"here"<<i<<j<<k<<"sum"<<sum<<endl;
                
				int leftcount = 0;
				int rightcount = 0;
				
				for (int ptr = j; ptr <= k; ++ptr)
				{
					if (arr[ptr] == arr[j])
					{
						leftcount++;
					}else
						break;
				}
				for (int ptr = k; ptr >= j; ptr--)
				{
					if (arr[ptr] == arr[k])
					{
						rightcount++;
					}else
						break;
				}

				int total = leftcount*rightcount;
              //  cout<<total;
				if (arr[j]==arr[k])
				{
					total = ((k-j+1)*(k-j))/2;
				}
             //   cout<<total;
				for(int m=0;m<total;m++){
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
		
				}

				j +=leftcount;
				k=k-rightcount;
			}
		}
	}

        
	}
}