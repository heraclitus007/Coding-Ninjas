/*
N-Queen Problem
Send Feedback
You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board. A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to print all such configurations.
Input Format :
Line 1 : Integer N
Output Format :
One Line for every board configuration. 
Every line will have N*N board elements printed row wise and are separated by space
Note : Don't print anything if there isn't any valid configuration.
Constraints :
1<=N<=10
Sample Input 1:
4
Sample Output 1 :
0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0 
0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 
*/



public class Solution {
	
		
	public static void placeNQueens(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */
		if(n>=4){
    
			int[][] arr=new int[n][n];
 			solve(arr,0,n);
        	
    	}
    
	}
    
    public static void solve(int[][] arr, int r, int n){
        
        if(r>=n)
            return;
		
        for(int c=0;c<n;c++){
            
            if(possible(arr,r,c)){
                
                if(r==n-1){
                    printMatrix(arr);
                   	System.out.println();
                }
                    
                else
                	solve(arr,r+1,n);
                
                arr[r][c]=0;
            }
        }
        return;
        //solve(arr,r-1,n);
        
    }
    
    public static boolean possible(int[][] arr, int r, int c){
        
        if(r==0){
         	arr[r][c]=1;
            return true;
        }
        int n=arr.length;
        for(int i=r-1;i>=0;i--){
            if(arr[i][c]==1)
            	return false;
        }
        int i,j;
        for(i=r-1,j=c-1; i>=0&&j>=0; i--,j--){
            if(arr[i][j]==1)
                return false;
            
        }
        for(i=r-1,j=c+1; i>=0&&j<n; i--,j++){
            if(arr[i][j]==1)
                return false;
            
        }
       
        arr[r][c]=1;
        return true;    
        
    }
    public static void printMatrix(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
                
            }
        }
        
        
    }
	
}
