/*
There is only one beauty parlour in the town CodingNinjasLand. The receptionist at the beauty parlor is flooded with appointment requests because the “Hakori” festival is round the corner and everyone wants to look good on it.
She needs your help. The problem is they don’t have chairs in reception. They are ordering chairs from NinjasKart. They don’t want to order more than required. You have to tell the minimum number of chairs required such that none of the customers has to stand.

First line contains the number of customers that will come. Second line contains N space-separated integers which represent the arrival timings of the customer. Third line contains N space-separated integers which represent the departure timings of the customer. Arrival and departure timings are given in 24-hour clock.

1<= N <= 100
Arrival and departure timings lie in the range [0000 to 2359]
Time Limit: 1 second

You have to print the minimum number of chairs required such that no customer has to wait standing. 
SAMPLE I/P 1:
5
900 1000 1100 1030 1600
1900 1300 1130 1130 1800

SAMPLE O/P 1:
4

4 because at 1100 hours, we will have maximum number of customers at the shop, throughout the day. And that maximum number is 4. 
*/

import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int dep[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
            dep[i]=sc.nextInt();
        
        
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    temp=dep[j];
                    dep[j]=dep[j+1];
                    dep[j+1]=temp;
                } 
        
        int chairs_till_now=0;
        int max=0;
      //  int exit_till_now=0;
        
//         for(int i=0;i<n;i++)
            
//             System.out.print(arr[i]+" ");
        
//         System.out.println();

//         for(int i=0;i<n;i++)
            
//             System.out.print(dep[i]+" ");

//         System.out.println();
        
        
        for(int i=0;i<n;i++){
            
            int t=arr[i];
            
            for(int j=0;j<=i;j++){
                
                if(dep[j]<t&&dep[j]!=-1){
                    
                	chairs_till_now--;
                    //exit_till_now=j;
                    dep[j]=-1;
                }
                
                else
                    continue;
            }
            
            chairs_till_now++;
            max=Math.max(max,chairs_till_now);
            //System.out.println(chairs_till_now+" "+max);
        }
     
        
        System.out.println(max);
	}

}