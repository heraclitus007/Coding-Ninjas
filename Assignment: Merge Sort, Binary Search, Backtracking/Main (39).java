/*
Given a 9*9 sudoku board, in which some entries are filled and others are 0 (0 indicates that the cell is empty), you need to find out whether the Sudoku puzzle can be solved or not i.e. return true or false.
Input Format :
9 Lines where ith line contains ith row elements separated by space
Output Format :
 true or false
Sample Input :
9 0 0 0 2 0 7 5 0 
6 0 0 0 5 0 0 4 0 
0 2 0 4 0 0 0 1 0 
2 0 8 0 0 0 0 0 0 
0 7 0 5 0 9 0 6 0 
0 0 0 0 0 0 4 0 1 
0 1 0 0 0 5 0 8 0 
0 9 0 0 7 0 0 0 4 
0 8 2 0 4 0 0 0 6
Sample Output :
true
*/





public class Solution {
	
	
	
	public static boolean sudokuSolver(int board[][]){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Don't print output and return output as specified in the question.
	 */
		
        int[] last=lastIndex(board);
        
        for(int i=0;i<9;i++){
            
            for(int j=0;j<9;j++){
                if(i>last[0]&&j>last[1])
                    return true;
                if(board[i][j]==0){
                    
                    for(int k=1;k<=9;k++){
                        //System.out.println(i+" "+j+" "+k);
                        if(possible(board,i,j,k)){
                            
                            board[i][j]=k;
                            //print(board);
                            if(sudokuSolver(board))
                                return true;
                            else{
                                //System.out.println("possible er else part e achi "+i+" "+j);
                                board[i][j]=0;
                                if(k==9)
                                    return false;
                            }
                        }
                        else{
                            if(k==9)
                                return false;
                            
                        }
                        
                    }
                    
                }
                
            }
        }
        return false;
        
	}
	
    public static boolean possible(int board[][],int r,int c,int k){
        
        return check_row(board,r,k)&&check_column(board,c,k)&&check_box(board,r,c,k);
            
    }
	public static boolean check_row(int[][] board,int r,int k){
        
        for(int i=0;i<9;i++){
            if(board[r][i]==k)
                return false;
        }
        return true;
        
    }
    public static boolean check_column(int[][] board,int c,int k){
        
        for(int i=0;i<9;i++){
            if(board[i][c]==k)
                return false;
        }
        return true;
        
    }
    public static boolean check_box(int[][] board, int r, int c, int k){
        int x,y;
        if(r<3)
            x=0;
        else if(r<6)
            x=3;
        else
            x=6;
        
        if(c<3)
            y=0;
        else if(c<6)
            y=3;
        else 
            y=6;
        
        for(int i=x;i<(x+3);i++){
            for(int j=y;j<(y+3);j++){
                if(board[i][j]==k)
                    return false;
            }
        }
        return true;
    }
    public static void print(int[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
    public static int[] lastIndex(int[][] board){
        int[] last=new int[2];
        for(int i=0;i<9;i++){
            
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    last[0]=i;
                    last[1]=j;
                }
            }
        }
        return last;
    }
	
}
