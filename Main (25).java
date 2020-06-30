/*
Once detective Saikat was solving a murder case. While going to the crime scene he took the stairs and saw that a number is written on every stair. He found it suspicious and decides to remember all the numbers that he has seen till now. While remembering the numbers he found that he can find some pattern in those numbers. So he decides that for each number on the stairs he will note down the sum of all the numbers previously seen on the stairs which are smaller than the present number. Calculate the sum of all the numbers written on his notes diary.
Answer may not fit in integer . You have to take long.
Input
First line gives T, number of test cases.

2T lines follow.

First line gives you the number of stairs N

Next line gives you N numbers written on the stairs.
Output
For each test case output one line giving the final sum for each test case.
Constraints
T<=10

1<=N<=10^5

All numbers will be between 0 and 10^6.
Sample Input:
1
5
1 5 3 6 4
Sample Output:
15
Explanation:
For the first number, the contribution to the sum is 0.
For the second number, the contribution to the sum is 1.
For the third number, the contribution to the sum is 1.
For the fourth number, the contribution to the sum is 9 (1+5+3).
For the fifth number, the contribution to the sum is 4 (1+3).
Hence the sum is 15 (0+1+1+9+4).
*/

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            
            int n=sc.nextInt();
            int arr[]=new int[n];
            
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
            System.out.println(solve(arr));
                        
        }
	}
    public static long solve(int[] arr){
        
        return split(arr,0,arr.length-1);
        
                
    }
    public static long split(int[] arr, int beg, int end){
        
        if(beg>=end)
            return 0;
        
        int mid=(beg+end)/2;
        long ans1=split(arr,beg,mid);
        long ans2=split(arr,mid+1,end);
        return ans1+ans2+merge(arr,beg,end);
        
    }
    public static long merge(int[] arr,int beg,int end){
        
        long sum=0;
        int mid=(beg+end)/2;
        int i=beg;
        int j=mid+1;
        int k=0;
        
        int[] temp=new int[end-beg+1];
        while(i<=mid&&j<=end){
            
            if(arr[i]<arr[j]){
                sum=sum+(end-j+1)*arr[i];
                temp[k++]=arr[i++];
                
            }
            else{
                temp[k++]=arr[j++];
            }

        }
       
        while(i<=mid){
            temp[k++]=arr[i++];
        }
         
        while(j<=end){
            temp[k++]=arr[j++];
        }
        
        int c=0;
    	for(int b=beg;b<=end;b++,c++){
        	arr[b] = temp[c];
    	}
        return sum;
        
    }
    

}