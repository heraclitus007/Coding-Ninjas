/*
Shreya loves to eat momos. Her mother gives her money to buy vegetables but she manages to save some money out of it daily. After buying vegetables, she goes to "Momos Market", where there are ‘n’ number of shops of momos. Each of the shops of momos has a rate per momo. She visits the market and starts buying momos (one from each shop) starting from the first shop. She will visit the market for ‘q’ days. You have to tell that how many momos she can buy each day if she starts buying from the first shop daily. She cannot use the remaining money of one day on some other day. But she will save them for other expenses in the future, so, you also need to tell the sum of money left with her at the end of each day.
Input Format:
First line will have an integer ‘n’ denoting the number of shops in market.
Next line will have ‘n’ numbers denoting the price of one momo of each shop.
Next line will have an integer ‘q’ denoting the number of days she will visit the market.
Next ‘q’ lines will have one integer ‘X’ denoting the money she saved after buying vegetables.
Constraints:
1 <= n <= 10^5
1 <= q <= 10^5
1 <= X <= 10^9
Output:
There will be ‘q’ lines of output each having two space separated integers denoting number of momos she can buy and amount of money she saved each day.
Sample Input:
4
2 1 6 3
1
11
Sample Output:
3 2
Explanation:
Shreya visits the "Momos Market" for only one day. She has 11 INR to spend. She can buy 3 momos, each from the first 3 shops. She would 9 INR (2 + 1 + 6) for the same and hence, she will save 2 INR.
*/

import java.util.*;
import java.util.Arrays;
public class Main {

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] pri=new int[n];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            
            if(i>0)
                pri[i]=pri[i-1]+x;
            else
                pri[i]=x;
            
        }
        
        int q=sc.nextInt();
        int[] mon=new int[q];
        for(int i=0;i<q;i++)
            mon[i]=sc.nextInt();
        
        int ans[][]=new int[q][2];
        
        for(int i=0;i<q;i++){
            
            int index=Arrays.binarySearch(pri,mon[i]);
            if(index>=0){
                
                ans[i][0]=index+1;
                ans[i][1]=0;
                
            }
            else{
                
                index++;
                index*=(-1);
                ans[i][0]=index;
                if(index!=0)
                
                    ans[i][1]=mon[i]-pri[index-1];
                
                else
                    ans[i][1]=mon[i];
            }
            
        }
        
        for(int i=0;i<q;i++)
            System.out.println(ans[i][0]+" "+ans[i][1]);
        
        
	}

}