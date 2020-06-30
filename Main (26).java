/*
Shaky has N (1<=N<=50000) candy boxes each of them contains a non-zero number of candies (between 1 and 1000000000). Shaky want to distibute these candies among his K (1<=K<=1000000000) IIIT-Delhi students. He want to distibute them in a way such that:
1. All students get equal number of candies.
2. All the candies which a student get must be from a single box only.
As he want to make all of them happy so he want to give as many candies as possible. Help Shaky in finding out what is the maximum number of candies which a student can get.
Input
First line contains 1<=T<=20 the number of test cases. Then T test cases follow. First line of each test case contains N and K. Next line contains N integers, ith of which is the number of candies in ith box.
Output
For each test case print the required answer in a seperate line.
Sample Input:
2
3 2 
3 1 4
4 1
3 2 3 9
Sample Output:
3
9
*/

import java.util.Scanner;
import java.util.Arrays;
public class Main {

	
	public static void main(String[] args) {
		// Write your code here
		
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            
            Arrays.sort(arr);
            System.out.println(solve(arr,0,arr[arr.length-1],k));
            
        }
        
	}
    
    public static int solve(int[] arr, int beg, int end, int k){
        int ans=0;
        while(beg<=end){
            
            int mid=(beg+end)/2;
            
            //System.out.println(beg+" "+mid+" "+end);
            if(possible(arr,mid,k))
            {
                
                ans=mid;
                beg=mid+1;
            }
            else
                end=mid-1;
            
        }
        
        return ans;
                      
        
    }
    
    public static boolean possible(int[] arr, int c, int s){
        int[] temp=new int[arr.length];
    	for(int i=0;i<arr.length;i++)
            temp[i]=arr[i];
        
        int i=arr.length-1;
        
        while(i>=0){
            
            if(temp[i]>=c){
                
                temp[i]=temp[i]-c;
                
                s--;
            }
            else
            	i--;
            if(s==0)
                return true;
            
        }
        
            return false;
        
        
    }
    

}