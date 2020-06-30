/*
You are given a N*N maze with a rat placed at maze[0][0]. Find and print all paths that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
Input Format
Line 1 : Integer N
Next N Lines : Each line will contain ith row elements (separated by space)
Output Format :
One Line for every possible solution. 
Every line will have N*N maze elements printed row wise and are separated by space. Only cells that are part of solution path should be 1, rest all cells should be 0.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
1 0 0 1 0 0 1 1 1 
Sample Output 1 Explanation :
Only 1 path is possible
Sample Input 2 :
3
1 0 1
1 1 1
1 1 1
Sample Output 2 :
1 0 0 1 1 1 1 1 1 
1 0 0 1 0 0 1 1 1 
1 0 0 1 1 0 0 1 1 
1 0 0 1 1 1 0 0 1 
Sample Output 2 Explanation :
4 paths are possible
*/




public class Solution {
	
	
	
	public static void ratInAMaze(int maze[][]){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */
		int[][] temp=new int[maze.length][maze.length];
        //temp[0][0]=1;
        
        solve(temp,maze,0,0);
        
	}
	
    public static void solve(int[][] temp, int[][] maze, int r, int c){
        int n=maze.length;
        
        if(r==n-1&&c==n-1){
            temp[r][c]=1;
            printMatrix(temp);
            //temp[r][c]=0;
        }
        
        if(possible(temp,maze,r,c)){
            temp[r][c]=1;
            
            solve(temp,maze,r+1,c);
            solve(temp,maze,r-1,c);
            solve(temp,maze,r,c+1);
            solve(temp,maze,r,c-1);
            
            temp[r][c]=0;
                
        }
        return;
            
        
        
    }
    public static boolean possible(int[][] temp,int[][] maze,int r,int c){
        
        if(r<0||r>=temp.length||c<0||c>=temp.length||temp[r][c]==1||maze[r][c]==0)
            return false;
        return true;
        
    }
    
    public static void printMatrix(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
                
            }
        }
        System.out.println();
        
        
    }
	
	
}
