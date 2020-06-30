/*
You are given with an array of integers that contain numbers in random order. Write a program to find the longest possible sequence of consecutive numbers using the numbers from given array.
You need to return the output array which contains consecutive elements. Order of elements in the output is not important.
Best solution takes O(n) time.
If two sequences are of equal length then return the sequence starting with the number whose occurrence is earlier in the array.
Input Format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
0 <= n <= 10^8
Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 
9 
10 
11 
12
Sample Input 2 :
7
3 7 2 1 9 8 1
Sample Output 2 :
7
8
9
Explanation: Sequence should be of consecutive numbers. Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], but output should be [7, 8, 9] because the starting point of [7, 8, 9] comes first in input array.
Sample Input 3 :
7
15 24 23 12 19 11 16
Sample Output 3 :
15 
16
*/

import java.util.*;
import java.io.*;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		//Your Code goes here
        HashMap<Integer,Boolean> hm=new HashMap<>();
        HashMap<Integer,Integer> in=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
            hm.put(arr[i],true);
        
        for(int i=0;i<arr.length;i++){
            
            if(in.containsKey(arr[i]))
                in.put(arr[i],Math.min(in.get(arr[i]),i));
            else
                in.put(arr[i],i);
            
        }
        //Iterator i = s.iterator();
       // Set<Map.Entry<Integer,Boolean>> s=hm.entrySet();
        //int min_curr=0;
        //System.out.println(s);
    	int min_best=arr[0];
        int size_best=1;
        
        for(int i=0;i<arr.length;i++){
            int size_curr=1;
            int a=arr[i];
            boolean y=hm.get(a);
            //ArrayList<Integer> temp=new ArrayList<>();
            //System.out.println(a+" "+y);
            int x=a;
            int min_curr=a;
            if(hm.containsKey(x+1)&&y){
                
                //temp.add(x);
                while(hm.containsKey(x+1)){
                    x++;
                    //temp.add(x);
                    hm.put(x,false);
					size_curr++;                    
                }
                
                
            }
            if(hm.containsKey(a-1)&&y){
                while(hm.containsKey(a-1)){
                    a--;
                    //temp.add(x);
                    hm.put(a,false);
					size_curr++;                    
                }
                min_curr=a;
                
            }
            
            
            
            if(size_best<size_curr||(size_best==size_curr&&in.get(min_curr)<in.get(min_best))){
                size_best=size_curr;
                min_best=min_curr;
            }            

            
        }
        for(int i=0;i<size_best;i++)
            ans.add(min_best++);
            
        return ans;
            
        
        
	}
}